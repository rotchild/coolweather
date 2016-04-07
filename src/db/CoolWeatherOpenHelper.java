package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
 public static final String CREATE_PROVINCE="create table Province("+"id integer primary key autoincrement,"+
"province_name text)";//省表的建表语句
 
 public static final String CREATE_CITY="create table City("+"id integer primary key autoincrement,"+
		 "city_name text)";//市表的建表语句
 
 public static final String CREATE_COUNTY="create table County("+"id integer primary key autoincrement,"+
		 "county_name text)";//县表的建表语句
 
 public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version){
	 super(context,name,factory,version);
 }
	@Override
	public void onCreate(SQLiteDatabase db) {
		// 创建省、市、县的表
     db.execSQL(CREATE_PROVINCE);
     db.execSQL(CREATE_CITY);
     db.execSQL(CREATE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO 自动生成的方法存根

	}

}
