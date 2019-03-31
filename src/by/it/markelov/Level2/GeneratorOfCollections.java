package by.it.markelov.Level2;

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
            collectionOfAlbums.add(new Album(nameOfAlbum+i, collectionOfTracks));
        }
        return collectionOfAlbums;
    }

    public static void filterAndGenerateCollectionOfTracks(CollectionOfAlbums source, int minTrackLenght) {
        ArrayList<AlbumTrackDuration> albumTrackDurationArrayList = new ArrayList<>();
        Stream<Album> stream = source.getAlbumArrayList().stream();
        stream
                .map((album) -> {
                            ArrayList<Track> trackArrayList = album.getCollectionOfTracks().getTrackArrayList();
                            for (Track track : trackArrayList) {
                                if (track.getDuration() > minTrackLenght) {
                                    albumTrackDurationArrayList.add(new AlbumTrackDuration(album.getName(), track.getName(), track.getDuration()));
                                }
                            }
                            return albumTrackDurationArrayList;
                        }
                )
                .forEach((albumTrackDurations) -> {
                    for (AlbumTrackDuration albumTrackDuration : albumTrackDurations) {
                        System.out.printf("<%s>-<%s>-<%d>%n", albumTrackDuration.getNameOfAlbum(),
                                albumTrackDuration.getNameOfTrack(), albumTrackDuration.getDurationOfTrack());
                    }
                });
    }
}
