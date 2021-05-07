import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Destination {
	AirplaneType privatetype = new AirplaneType();
	int x ;
	String places;
	Scanner input = new Scanner(System.in);
	
	void Private(){

	//privatetype.airplaneType.setVisible(false);
	 x = 5;
	 TravelType();
		
	}
	
	void Business() {
		//privatetype.airplaneType.setVisible(false);
		x = 6;
		TravelType();
	}
	
	void Regular() {
		//privatetype.airplaneType.setVisible(false);
		x = 7;
		TravelType();
	}
	
	
	void TravelType() {
		
	System.out.println("Choose Travel Type\n a-Local FLights\n b-International Flights");
	String a = input.nextLine();
	
	if(a.equalsIgnoreCase("a")) {
		TravelLocalDestination();
	}else if(a.equalsIgnoreCase("b")) {
		 TravelInternationalDestination(); 
	}

	
	
	}	
	
	void TravelLocalDestination() {
		System.out.println("Choose Travel Type\n a-Manila to batanes \n b- Batanes To manila");
		String a = input.nextLine();
		
		if(a.equalsIgnoreCase("a")) {
			ManilaToBatanes();
		}else if(a.equalsIgnoreCase("b")) {
			BatanesToManila(); 
		}
		
	}
	
	void TravelInternationalDestination() {
		System.out.println("Choose Travel Type\n a-Manila to korea \n b- korea To manila");
		String a = input.nextLine();
		
		if(a.equalsIgnoreCase("a")) {
			ManilaToSouthKorea();
		}else if(a.equalsIgnoreCase("b")) {
			SouthKoreaToManila(); 
		}
	}
	
	
	
	//method of Destination
	
	//local flight
	void ManilaToBatanes() {
		places = "ManilaToBatanes";
		System.out.println(places);
		System.out.println(x);	
	}
	
	
	void BatanesToManila() {
		places = "BatanesToManila";
		System.out.println(places);
		System.out.println(x);	
	}
	
	void ManilaToPalawan() {
		places = "ManilaToPalawan";
	}
	
	void PalawanToManila() {
		places = "PalawanToManila";
	}
	
	//international Flight
	
	void ManilaToSouthKorea() {
		places = "ManilaToSouthKorea";
		System.out.println(places);
		System.out.println(x);	
	}
	
	void SouthKoreaToManila() {
		places = "SouthKoreaToManila";
		System.out.println(places);
		System.out.println(x);	
	}
	
	void ManilatoJapan() {
		places = "ManilatoJapan";
	}
	
	void JapanToManila() {
		places = "JapanToManila";
	}
	
	void ManilatoVietnam() {
		places = "ManilatoVietnam";
	}
	
	
	void VietnamToManila() {
		places = "VietnamToManila";
	}
	
}
