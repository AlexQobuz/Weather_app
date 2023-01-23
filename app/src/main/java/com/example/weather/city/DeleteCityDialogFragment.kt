package com.example.weather.city

import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment

class DeleteCityDialogFragment : DialogFragment() {

    interface DeleteCityDialogListener {
        fun onDialogPositiveClick()
        fun onDialogNegativeClick()
    }

    companion object {

        val EXTRA_CITY_NAME = "Alexandre.projet_android.weather_app.extras.EXTRA_CITY_NAME"

        fun newInstance(cityName : String) : DeleteCityDialogFragment {
            val fragment = DeleteCityDialogFragment()
            fragment.arguments = Bundle().apply {
                putString(EXTRA_CITY_NAME, cityName)
            }
            return fragment
        }
    }

    var listener: DeleteCityDialogListener? = null
    private lateinit var cityName: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        cityName = requireArguments().getString(EXTRA_CITY_NAME).toString()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder = AlertDialog.Builder(context)

        builder.setTitle("Do you really want to delete $cityName")
            .setPositiveButton("Delete city",
                { _, _ -> listener?.onDialogPositiveClick()})
            .setNegativeButton("Cancel",
                { _, _ -> listener?.onDialogNegativeClick() })

        return builder.create()
    }

}