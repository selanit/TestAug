package com.bss.mobile;

public class iPhone extends SmartPhone {

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("Within the mobile package --iphone -- Receive Method");
		
	}

	@Override
	public void playSong(int songid) {
		// TODO Auto-generated method stub
		System.out.println("Within the mobile package --iphone -- playSong");
	}

	@Override
	public void showSongsList() {
		// TODO Auto-generated method stub
		System.out.println("Within the mobile package --iphone-- showSongsList");
	}

	@Override
	public String getSongDetails(int songid) {
		// TODO Auto-generated method stub
		System.out.println("Within the mobile package --iphone-- getSongDetail");
		return null;
	}

	@Override
	public void sendText(int to, String msg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
public static void main(String args[])
{
	iPhone i=new iPhone();
	i.dial(1);
}
	
	
	
}
