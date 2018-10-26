package speechtoText;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ibm.watson.developer_cloud.speech_to_text.v1.SpeechToText;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.RecognizeOptions;
import com.ibm.watson.developer_cloud.speech_to_text.v1.model.SpeechRecognitionResults;

public class SpeechtoText_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		speechtotext_lib slib = new speechtotext_lib(new File("audio/track06.mp3"));
        SpeechRecognitionResults transcript = slib.getTranscript();
        System.out.println(transcript);
        slib.getJson(transcript);
	
	}
}