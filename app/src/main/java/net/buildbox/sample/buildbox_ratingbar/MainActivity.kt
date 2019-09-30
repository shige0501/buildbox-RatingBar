package net.buildbox.sample.buildbox_ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sampleRating: RatingBar = findViewById(R.id.sample_rating)
        sampleRating.setOnRatingBarChangeListener { _, rating, _ ->
            Toast.makeText(this, "現在のレーティングは $rating です", Toast.LENGTH_SHORT).show()
        }
    }
}
