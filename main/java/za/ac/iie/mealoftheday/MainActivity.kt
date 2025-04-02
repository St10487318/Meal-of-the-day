package za.ac.iie.mealoftheday

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Declaring my varibles
        val input = findViewById<EditText>(R.id.input)
        val sug = findViewById<TextView>(R.id.txtResults)
        val find = findViewById<Button>(R.id.btnselect)
        val clear = findViewById<Button>(R.id.btnclear)


//Activating button
        find.setOnClickListener {

            val timeOfDay = input.text.toString().lowercase()
            var sugmeal = ""


            if (timeOfDay == "morning") {
                sugmeal = "full English breakfast \n" +
                        "Omelette\n" +
                        "Pancakes"


            } else if (timeOfDay == "light snack") {

                sugmeal = "Fruit \n Yogurt \nNuts"
            } else if (timeOfDay == "lunch") {

                sugmeal = "Chips and sausage \n Sandwich \nBurger"
            } else if (timeOfDay == "quick snack") {
                sugmeal = "Nuts \n Fruits"
            } else if (timeOfDay == "main course") {
                sugmeal = "Spaghetti and mince \n Pap and wors \n Dumpling ,beef and stew"
            } else if (timeOfDay == "Desert ") {
                sugmeal = "Pudding \n Truffle \nFruit salad"
            } else {
                sugmeal ="Invalid input. Please enter morning, afternoon, or night." }

            sug.text = sugmeal
        }

        clear.setOnClickListener{

            input.text.clear() // Clears input field
            sug.text = ""

        }
    }
}

