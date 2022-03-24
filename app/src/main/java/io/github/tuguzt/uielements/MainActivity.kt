package io.github.tuguzt.uielements

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.tuguzt.uielements.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.run {
            button.setOnClickListener {
                val editText = editText.text
                val checkBox = if (checkBox.isChecked) "ON" else "OFF"
                val toggleButton = if (toggleButton.isChecked) "ON" else "OFF"
                val radioGroup = when {
                    radioButton1.isChecked -> radioButton1.text
                    radioButton2.isChecked -> radioButton2.text
                    else -> "OFF"
                }
                val text = """
                    EditText: $editText
                    CheckBox: $checkBox
                    ToggleButton: $toggleButton
                    RadioGroup: $radioGroup
                """.trimIndent()
                textView.text = text
            }
        }
    }
}
