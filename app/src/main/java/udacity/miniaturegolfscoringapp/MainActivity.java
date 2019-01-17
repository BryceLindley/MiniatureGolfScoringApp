package udacity.miniaturegolfscoringapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scorePlayerOne = 0;
    int scorePlayerTwo = 0;

    public void reset(View view) {
        scorePlayerOne = 0;
        scorePlayerTwo = 0;
        displayForPlayerOne(scorePlayerOne);
        displayForPlayerTwo(scorePlayerTwo);
    }

    public void onePutt(View view) {
        scorePlayerOne = scorePlayerOne + 1;
        displayForPlayerOne(scorePlayerOne);

    }

    public void twoPutts(View view) {
        scorePlayerOne = scorePlayerOne + 2;
        displayForPlayerOne(scorePlayerOne);

    }

    public void threePutts(View view) {
        scorePlayerOne = scorePlayerOne + 3;
        displayForPlayerOne(scorePlayerOne);
    }

    public void fourPutts(View view) {
        scorePlayerOne = scorePlayerOne + 4;
        displayForPlayerOne(scorePlayerOne);
    }

    public void onePuttp(View view) {
        scorePlayerTwo = scorePlayerTwo + 1;
        displayForPlayerTwo(scorePlayerTwo);

    }

    public void twoPuttsp(View view) {
        scorePlayerTwo = scorePlayerTwo + 2;
        displayForPlayerTwo(scorePlayerTwo);

    }

    public void threePuttsp(View view) {
        scorePlayerTwo = scorePlayerTwo + 3;
        displayForPlayerTwo(scorePlayerTwo);

    }

    public void fourPuttsp(View view) {
        scorePlayerTwo = scorePlayerTwo + 4;
        displayForPlayerTwo(scorePlayerTwo);

    }


    /**
     * Displays the given score for PlayerOne.
     */
    public void displayForPlayerOne(int score) {
        TextView scoreView = findViewById(R.id.playerOne);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for PlayerTwo.
     */
    public void displayForPlayerTwo(int score) {
        TextView scoreView = findViewById(R.id.playerTwo);
        scoreView.setText(String.valueOf(score));

    }
}
