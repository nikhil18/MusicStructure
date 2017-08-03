package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class NowPlayingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_now_playing);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nowplayingmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.go_to_songs:
                Intent songsIntent = new Intent(NowPlayingActivity.this, SongsActivity.class);
                startActivity(songsIntent);
                return true;
            case R.id.go_to_album:
                Intent albumsIntent = new Intent(NowPlayingActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
                return true;
            case R.id.add_to_playlist:
                Intent playlistIntent = new Intent(NowPlayingActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
                return true;
            case R.id.go_to_artist:
                Intent artistIntent = new Intent(NowPlayingActivity.this, ArtistsActivity.class);
                startActivity(artistIntent);
                return true;
            case R.id.go_to_search:
                Intent searchIntent = new Intent(NowPlayingActivity.this, SearchActivity.class);
                startActivity(searchIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
