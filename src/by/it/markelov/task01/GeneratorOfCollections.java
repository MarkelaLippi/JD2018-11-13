package by.it.markelov.task01;

import java.util.ArrayList;
import java.util.stream.Stream;

public class GeneratorOfCollections {

    public static CollectionOfTracks generateCollectionOfTracks(int amountOfTracks, int minTrackDuration,
                                                                int maxTrackDuration) {
        CollectionOfTracks collectionOfTracks = new CollectionOfTracks();
        String nameOfTrack = "Track: ";
        for (int i = 1; i <= amountOfTracks; i++) {
            collectionOfTracks.add(new Track(nameOfTrack + i, minTrackDuration, maxTrackDuration));
        }
        return collectionOfTracks;
    }

    public static CollectionOfAlbums generateCollectionOfAlbums(int n, int m, int minLength,
                                                                int maxLength) {

        CollectionOfAlbums collectionOfAlbums = new CollectionOfAlbums();
        String nameOfAlbum = "Album: ";
        for (int i = 1; i <= n; i++) {
            CollectionOfTracks collectionOfTracks = generateCollectionOfTracks(m, minLength, maxLength);
            collectionOfAlbums.add(new Album(nameOfAlbum + i, collectionOfTracks));
        }
        return collectionOfAlbums;
    }

    public static void filterAndGenerateCollectionOfTracks(CollectionOfAlbums source, int minTrackLenght) {
        ArrayList<Track> temp = new ArrayList<>();
        Stream<Album> stream = source.getAlbumArrayList().stream();
        stream
                .map((album) -> {
                    ArrayList<Track> trackArrayList = album.getCollectionOfTracks().getTrackArrayList();
                    for (Track track : trackArrayList) {
                        if (track.getDuration() > minTrackLenght)
                            temp.add(track);
                    }
                    return new Album(album.getName(), new CollectionOfTracks(temp));
                })
                .forEach(filteredAlbum -> {
                    ArrayList<Track> trackArrayList = filteredAlbum.getCollectionOfTracks().getTrackArrayList();
                    for (Track track : trackArrayList) {
                        System.out.printf("<%s>-<%s>-<%d>%n", filteredAlbum.getName(), track.getName(), track.getDuration());
                    }
                });
    }
}
