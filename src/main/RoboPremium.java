package main;

import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class RoboPremium {


	void agir () {

		try {
			File clap =  new File("src//som.wav");
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(clap));
			clip.start();


		}catch(Exception e) {
			System.out.println(e);
		}

	}
}
