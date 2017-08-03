package com.example.android.musicstructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);
        TextView playing = (TextView) findViewById(R.id.nowPlayingTextview);

        playing.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent playingIntent = new Intent(ArtistsActivity.this, NowPlayingActivity.class);
            startActivity(playingIntent);
        }
    });
}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.artistsmenu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(final MenuItem item) {

        switch (item.getItemId()) {
            case R.id.go_to_songs:
                Intent songsIntent = new Intent(ArtistsActivity.this, SongsActivity.class);
                startActivity(songsIntent);
                return true;
            case R.id.go_to_album:
                Intent albumsIntent = new Intent(ArtistsActivity.this, AlbumsActivity.class);
                startActivity(albumsIntent);
                return true;
            case R.id.add_to_playlist:
                Intent playlistIntent = new Intent(ArtistsActivity.this, PlaylistActivity.class);
                startActivity(playlistIntent);
                return true;
            case R.id.go_to_search:
                Intent searchIntent = new Intent(ArtistsActivity.this, SearchActivity.class);
                startActivity(searchIntent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}

