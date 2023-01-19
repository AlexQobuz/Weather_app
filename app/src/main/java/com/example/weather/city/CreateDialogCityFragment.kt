package com.example.weather.city

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import androidx.fragment.app.DialogFragment

class CreateDialogCityFragment : DialogFragment() {

    interface {
        fun onDialogPositvClick(cityName: String)
        fun onDialogNegativClick()
    }

    val listener: CreateCityDialogListener? = null

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(context)

        val input = EditText(context)
        with(input) {
            inputType = InputType.TYPE_CLASS_TEXT
            hint = "New York, London..."
        }
        builder.setTitle("New York city name ?")
            .setView(input)
            .setPositiveButton("Create city")

    }

}