package by.it.markelov.task01;

import java.util.ArrayList;

public class CollectionOfAlbums {
    private ArrayList<Album> albumArrayList;

    public CollectionOfAlbums() {
        albumArrayList = new ArrayList<>();
    }

    public ArrayList<Album> getAlbumArrayList() {
        return albumArrayList;
    }

    public void setAlbumArrayList(ArrayList<Album> albumArrayList) {
        this.albumArrayList = albumArrayList;
    }

    public void add(Album album) {
        albumArrayList.add(album);
    }
}
