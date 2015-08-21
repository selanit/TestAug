package com.bss.mobile;

public abstract class SmartPhone implements Phone, Mp3Player  {

	public void dial(int b)
	{
		System.out.println("Dialing");
	}
	public abstract void sendText(int to, String msg);
	
	public void playSong(int songid)
	{
		System.out.println("Within the smartPhone abstract class --- Playing Song --");
	}
	public void showSongsList()
	{
		System.out.println("Within smartPhone abstract class ---Showing the songlist within the smartphone class");
	}
	
	// playsong, getsong()
	
	
}
