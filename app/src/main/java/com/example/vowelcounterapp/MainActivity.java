// Write a program that counts the number of vowels in a sentence.
// eg " Hello World " => returns 2

package com.example.vowelcounterapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countVowels(View view) {
        EditText inputEditText = findViewById(R.id.inputEditText);
        TextView resultTextView = findViewById(R.id.resultTextView);

        String input = inputEditText.getText().toString().toLowerCase(); // Convert to lowercase for case insensitivity
        int vowelCount = countVowelsInString(input);
        resultTextView.setText(String.valueOf(vowelCount));
    }

    private int countVowelsInString(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}
