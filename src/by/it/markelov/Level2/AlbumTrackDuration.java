package by.it.markelov.Level2;

public class AlbumTrackDuration {
    private String nameOfAlbum;
    private String nameOfTrack;
    private int durationOfTrack;

    public AlbumTrackDuration(String nameOfAlbum, String nameOfTrack, int durationOfTrack) {
        this.nameOfAlbum = nameOfAlbum;
        this.nameOfTrack = nameOfTrack;
        this.durationOfTrack = durationOfTrack;
    }

    public String getNameOfAlbum() {
        return nameOfAlbum;
    }

    public String getNameOfTrack() {
        return nameOfTrack;
    }

    public int getDurationOfTrack() {
        return durationOfTrack;
    }

    public void setNameOfAlbum(String nameOfAlbum) {
        this.nameOfAlbum = nameOfAlbum;
    }

    public void setNameOfTrack(String nameOfTrack) {
        this.nameOfTrack = nameOfTrack;
    }

    public void setDurationOfTrack(int durationOfTrack) {
        this.durationOfTrack = durationOfTrack;
    }
}
