package chap04;

public class Song {
	private String title;
	
	public Song(String title) {
		this.title = title;
	}
	
	private String getTitle() {
		return title;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Song mySong = new Song("Nessun Dorma");
		Song yourSong = new Song("���ִ� �� �� �̷��");
		System.out.println("�� �뷡�� " + mySong.getTitle());
		System.out.println("�� �뷡�� " + yourSong.getTitle());

	}

}
