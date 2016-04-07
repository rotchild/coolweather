package db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
 public static final String CREATE_PROVINCE="create table Province("+"id integer primary key autoincrement,"+
"province_name text)";//ʡ��Ľ������
 
 public static final String CREATE_CITY="create table City("+"id integer primary key autoincrement,"+
		 "city_name text)";//�б�Ľ������
 
 public static final String CREATE_COUNTY="create table County("+"id integer primary key autoincrement,"+
		 "county_name text)";//�ر�Ľ������
 
 public CoolWeatherOpenHelper(Context context,String name,CursorFactory factory,int version){
	 super(context,name,factory,version);
 }
	@Override
	public void onCreate(SQLiteDatabase db) {
		// ����ʡ���С��صı�
     db.execSQL(CREATE_PROVINCE);
     db.execSQL(CREATE_CITY);
     db.execSQL(CREATE_COUNTY);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO �Զ����ɵķ������

	}

}
