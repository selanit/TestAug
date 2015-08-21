package com.bss.mobile;

public class Android extends SmartPhone {

	@Override
	public void receive() {
		// TODO Auto-generated method stub
		System.out.println("Within the mobile package --Android --  receive");
		
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		System.out.println("Within the mobile package --Android --  getVersion");
		return null;
	}

	@Override
	public String getSongDetails(int songid) {
		// TODO Auto-generated method stub
		System.out.println("Within the mobile package --Android --  getSongDetails");
		return null;
	}

	@Override
	public void sendText(int to, String msg) {
		// TODO Auto-generated method stub
	}
		
		public static void main(String args[])
		{
			System.out.println(" ----- Im being executed from the Android Class -----");
			Android a=new Android();
			a.getVersion();
			a.playSong(1);
			System.out.println(" -----  End of Android Class ------");
		}
		
		
	}

