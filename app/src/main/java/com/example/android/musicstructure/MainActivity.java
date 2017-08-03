package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView albums = (TextView) findViewById(R.id.albums_textview);
        TextView songs = (TextView) findViewById(R.id.songs_textview);
        TextView artists = (TextView) findViewById(R.id.artists_textview);
        TextView playlist = (TextView) findViewById(R.id.playlist_textview);
        TextView search = (TextView) findViewById(R.id.search_textview);
        TextView playing = (TextView) findViewById(R.id.nowPlayingTextview);
        TextView buyonline = (TextView) findViewById(R.id.buyOnline);

        albums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent albumsIntent = new Intent(MainActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
            }
        });

        artists.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent artistsIntent = new Intent(MainActivity.this, ArtistsActivity.class);
                startActivity(artistsIntent);
            }
        });

        playlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playlistIntent = new Intent(MainActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
            }
        });

        songs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent songsIntent = new Intent(MainActivity.this, SongsActivity.class);
                startActivity(songsIntent);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent searchIntent = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(searchIntent);
            }
        });

        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, NowPlayingActivity.class);
                startActivity(playingIntent);
            }
        });

        buyonline.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(MainActivity.this, BuyOnline.class);
                startActivity(playingIntent);
            }
        });
    }
}
