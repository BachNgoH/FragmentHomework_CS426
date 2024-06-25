/*
 * Copyright (C) 2017 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.fragmenthomework.content;

import java.util.ArrayList;
import java.util.List;

/**
 * Helper class for providing sample song content.
 */

public class SongUtils {

    // An ArrayList of Songs
    public static final List<Song> SONG_ITEMS = new ArrayList<>();

    // The ID for the index into song titles.
    public static final String SONG_ID_KEY = "item_id";

    // The number of songs.
    private static final int COUNT = 7;

    /**
     * A Song item represents a song title, and song details.
     */
    public static class Song {
        public final String song_title;
        public final String details;

        private Song(String content, String details) {
            this.song_title = content;
            this.details = details;
        }
    }

    /**
     * Add an item to the array.
     *
     * @param item Each song
     */
    private static void addItem(Song item) {
        SONG_ITEMS.add(item);
    }

    static {
        // Fill the array with songs.
        for (int i = 0; i < COUNT; i++) {
            addItem(createSongAtPosition(i));
        }
    }

    /**
     * Manually creates each song title and song detail.
     *
     * @param position Position of the song in the list.
     * @return
     */
    private static Song createSongAtPosition(int position) {
        String newTitle;
        String newDetail;
        switch (position) {
            case 0:
                newTitle = "Stairway to Heaven";
                newDetail = "Stairway to Heaven\n\nAn iconic rock song by Led Zeppelin, released in late 1971. The song, composed by guitarist Jimmy Page and lead singer Robert Plant, is often regarded as one of the greatest rock songs of all time. It features a complex structure with multiple musical sections and is notable for its gradual build-up from a slow acoustic introduction to a high-energy rock climax.";
                break;
            case 1:
                newTitle = "Bohemian Rhapsody";
                newDetail = "Bohemian Rhapsody\n\nA revolutionary six-minute suite by Queen, released in 1975. Written by Freddie Mercury, this song defies conventional structure with its distinct ballad, opera, and hard rock sections. The elaborate production and ambitious composition have made it a beloved classic, frequently topping 'greatest song' lists and inspiring a biographical film of the same name.";
                break;
            case 2:
                newTitle = "Hotel California";
                newDetail = "Hotel California\n\nReleased by the Eagles in 1977, this song is famed for its enigmatic lyrics and haunting melody. Written by Don Felder, Don Henley, and Glenn Frey, it describes the surreal experience of arriving at a luxury hotel that one can never leave. The extended guitar solo is one of the most memorable in rock history.";
                break;
            case 3:
                newTitle = "Imagine";
                newDetail = "Imagine\n\nJohn Lennon's 1971 single that envisions a world of peace without borders, religion, or possessions. The song's simple melody and profound message have cemented it as an anthem for hope and unity. Lennon's plea for peace continues to resonate with listeners around the world.";
                break;
            case 4:
                newTitle = "Purple Haze";
                newDetail = "Purple Haze\n\nA defining song by The Jimi Hendrix Experience, released in 1967. Known for its innovative use of guitar effects and Hendrix's signature playing style, the song has become an enduring symbol of the psychedelic era. The opening riff is instantly recognizable and has influenced countless guitarists.";
                break;
            case 5:
                newTitle = "Like a Rolling Stone";
                newDetail = "Like a Rolling Stone\n\nBob Dylan's revolutionary 1965 single that transformed popular music. The song's confrontational lyrics, delivered with Dylan's distinctive voice, and its organ-driven sound broke new ground for what a pop song could be. It remains a high-water mark in Dylan's illustrious career.";
                break;
            default:
                newTitle = "Yesterday";
                newDetail = "Yesterday\n\nA timeless ballad by The Beatles, written by Paul McCartney and released in 1965. The song's melancholic melody and lyrics about lost love have made it one of the most covered songs in history. McCartney's solo performance with a string quartet marked a departure from the band's usual rock style.";
                break;
        }

        return new Song(newTitle, newDetail);
    }
}
