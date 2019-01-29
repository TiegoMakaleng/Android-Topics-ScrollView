package makaleng.tiego.com.androidtopicstoyapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTopicListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Using findViewById, we get a reference to our TextView from xml. This allows us to
         * do things like set the text of the TextView.
         */
        mTopicListTextView = (TextView) findViewById(R.id.tv_topic_names);


        String[] topics = AndroidTopics.getTopics();

        /*
         * Iterate through the array and append the Strings to the TextView.
         */
        for (String topic : topics) {
            mTopicListTextView.append(topic + "\n\n");
        }
    }
}