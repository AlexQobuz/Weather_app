package com.example.weather

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

private const val DATABASE_NAME = "weather.db"
private const val DATABASE_VERSION = 1

private const val CITY_TABLE_NAME = "city"
private const val CITY_KEY_ID = "id"
private const val CITY_KEY_NAME = "name"

// Constante pour créer la base de données
private const val CITY_TABLE_CREATE = """
    CREATE TABLE $CITY_TABLE_NAME (
        $CITY_KEY_ID INTEGER PRIMARY KEY,
        $CITY_KEY_NAME TEXT
"""

class Database(context: Context)
    : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    // Ici je récupère la constante pour
    // créer la BDD et ensuite je la crée
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(CITY_TABLE_NAME)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

}