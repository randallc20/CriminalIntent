package database;

import android.database.Cursor;
import android.database.CursorWrapper;

import com.example.austinchoi.criminalintent.Crime;

import java.util.Date;
import java.util.UUID;

public class CrimeCursorWrapper extends CursorWrapper {
    public CrimeCursorWrapper(Cursor cursor) {
        super(cursor);
    }

    public Crime getCrime() {
        String uuidString = getString(getColumnIndex(CrimeDbSchema.Columns.UUID));
        String title = getString(getColumnIndex(CrimeDbSchema.Columns.TITLE));
        long date = getLong(getColumnIndex(CrimeDbSchema.Columns.DATE));
        long time = getLong(getColumnIndex(CrimeDbSchema.Columns.TIME));
        int isSolved = getInt(getColumnIndex(CrimeDbSchema.Columns.SOLVED));
        int isSerious = getInt(getColumnIndex(CrimeDbSchema.Columns.SERIOUS));

        Crime crime = new Crime(UUID.fromString(uuidString));
        crime.setTitle(title);
        crime.setDate(new Date(date));
        crime.setDate(new Date(time));
        crime.setSolved(isSolved != 0);
        crime.setPolice(isSerious != 0);

        return crime;
    }
}
