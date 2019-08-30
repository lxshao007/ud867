package com.example.javajokes;

import java.util.Random;

public class Joke {
    private final String[] jokes = {
            "My boss told me to have a good day.. so I went home.",
            "I have a boy from another nation, which nation? imagination ",
            "This is a funny joke"

    };

    public String getJoke() {
        int index = new Random().nextInt(jokes.length);
        return jokes[index];
    }
}
