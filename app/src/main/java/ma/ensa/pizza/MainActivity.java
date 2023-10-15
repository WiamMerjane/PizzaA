package ma.ensa.pizza;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;





public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true); // Active le bouton de retour en arrière
//
//        toolbar.setNavigationOnClickListener(v -> onBackPressed()); // Gère le clic sur le bouton de retour en arrière


        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        String pizzaName = intent.getStringExtra("pizzaName");
        int pizzaPhoto = intent.getIntExtra("pizzaPhoto", 0); // Assuming it's an integer resource ID
        String pizzaDuration = intent.getStringExtra("pizzaDuration");
        String pizzaDescription = intent.getStringExtra("pizzaDescription");
        String pizzaIngredients = intent.getStringExtra("pizzaIngredients");
        String pizzaPreparation = intent.getStringExtra("pizzaPreparation");

        // Find TextViews and ImageView in the layout
        TextView idTextView = findViewById(R.id.id);
        TextView nameTextView = findViewById(R.id.nom);
        ImageView photoImageView = findViewById(R.id.photo);
        TextView durationTextView = findViewById(R.id.duree);
        TextView descriptionTextView = findViewById(R.id.description);
        TextView ingredientsTextView = findViewById(R.id.detailsIngred);
        TextView preparationTextView = findViewById(R.id.preparation);

        // Update TextViews and ImageView with pizza information
        idTextView.setText(id);
        nameTextView.setText(pizzaName);
        photoImageView.setImageResource(pizzaPhoto);
        durationTextView.setText(pizzaDuration);
        descriptionTextView.setText("Description: " + pizzaDescription);
        ingredientsTextView.setText("Ingredients: " + pizzaIngredients);
        preparationTextView.setText("Preparation: " + pizzaPreparation);
    }
}