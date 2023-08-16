package com.example.ejerciciovideoview;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Obtén la referencia al VideoView en el diseño XML (activity_main.xml)
        VideoView video = findViewById(R.id.video1);

        // Construye la ruta del video en los recursos de la aplicación
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video;

        // Convierte la ruta en un objeto Uri para el VideoView
        Uri uri = Uri.parse(videoPath);

        // Establece la URI del video en el VideoView
        video.setVideoURI(uri);

        // Crea un controlador de medios para controlar la reproducción
        MediaController mediaController = new MediaController(this);

        // Asocia el controlador de medios al VideoView
        video.setMediaController(mediaController);

        // Establece la vista anclaje del controlador de medios al VideoView
        mediaController.setAnchorView(video);
    }
    }
}