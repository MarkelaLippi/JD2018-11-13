package by.it.markelov.task01;

public class Runner {
    public static void main(String[] args) {
        CollectionOfAlbums source = GeneratorOfCollections.generateCollectionOfAlbums(3, 5, 2, 5);
        GeneratorOfCollections.filterAndGenerateCollectionOfTracks(source, 3);
    }
}
