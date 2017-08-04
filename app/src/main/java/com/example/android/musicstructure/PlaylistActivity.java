package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class PlaylistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_playlist);
        TextView playing = (TextView) findViewById(R.id.nowPlayingTextview);

        playing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent playingIntent = new Intent(PlaylistActivity.this, NowPlayingActivity.class);
                startActivity(playingIntent);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.playlistmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.go_to_songs:
                Intent songsIntent = new Intent(PlaylistActivity.this, SongsActivity.class);
                startActivity(songsIntent);
                return true;
            case R.id.go_to_album:
                Intent playlistIntent = new Intent(PlaylistActivity.this, AlbumsActivity.class);
                startActivity(playlistIntent);
                return true;
            case R.id.go_to_artist:
                Intent artistIntent = new Intent(PlaylistActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
                return true;
            case R.id.go_to_search:
                Intent searchIntent = new Intent(PlaylistActivity.this, SearchActivity.class);
                startActivity(searchIntent);
                return true;
            case R.id.got_to_buy_online:
                Intent buyonlineIntent = new Intent(PlaylistActivity.this, BuyOnline.class);
                startActivity(buyonlineIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
