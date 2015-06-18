package edu.buffalo.cse.cse486586.simpledynamo;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.AsyncTask;
import android.telephony.TelephonyManager;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

public class SimpleDynamoProvider extends ContentProvider {
    String sending = "";
    String sending2 = "";
    String sending3 = "";
    String sending4 = "";
    String sending5 = "";
    String sending6 = "";
    String sending7 = "";
    String sending8 = "";
    String sending9 = "";
    SQLiteQueryBuilder mybuilder2 = new SQLiteQueryBuilder();
    SQLiteDatabase myDatabase = null;
    volatile boolean lockerA = false;
    volatile boolean lockerB = false;
    Cursor dCursor = null;
    SQLiteQueryBuilder myBuilder = null;
    SQLiteDatabase myDB = null;
    Cursor dCursor2 = null;
    SQLiteQueryBuilder myBuilder2 = null;
    SQLiteDatabase myDB2 = null;
    SQLiteDatabase check = null;
    //-------------------------------------------------------------
    private String mfH = null;
    private String solppi = "";
    private String guman = null;
    private String nakim = null;
    private String nakkim = null;
    private MatrixCursor mfCur = null;
    private Vector<Integer> avdList = new Vector<>();
    private String temp6 = "";
    private String temp7 = "";
    private MatrixCursor matCursor = null;
    private String sb = "";
    private String sb2 = "";
    private String temp1 = "";
    private String temp2 = "";
    private String temp3 = "";
    private String temp4 = "";
    private String temp5 = "";
    private String byul = "";
    private Vector<Destination> destination = new Vector<>();
    private int counter = 0;
    private String init = "default";
    private String firstFactor = "moo";
    private String secondFactor = "young";
    private String choose = "boo";
    private String doem = "boo2";
    private Uri myUri;
    private String portStr;
    private String myPort;
    private String llo = "";
    private Vector<TargetCursor> tc = new Vector<>();
    private Vector<TargetCursor> tc2 = new Vector<>();
    private String TAG = SimpleDynamoActivity.class.getSimpleName();
    private Cursor myCursor = null;
    private Cursor tempCursor = null;
    private myDatabase myDATA;
    private Vector<Vector<Integer>> vector = new Vector<>();
    private Vector<Integer> sub_vec1 = new Vector<>();
    private Vector<Integer> sub_vec2 = new Vector<>();
    private Vector<Integer> sub_vec3 = new Vector<>();
    private Vector<Integer> sub_vec4 = new Vector<>();
    private Vector<Integer> sub_vec5 = new Vector<>();

    //------------------------------------------------------------
    @Override
    public int delete(Uri uri, String selection, String[] selectionArgs) {

        if (Compare(selection, "\"@\"") == 0) {

            SQLiteDatabase tempDB = myDATA.getWritableDatabase();
            tempDB.delete("main", "1", null);
            getContext().getContentResolver().notifyChange(myUri, null);

        } else if (Compare(selection, "\"*\"") == 0) {
            SQLiteDatabase tempDB2 = myDATA.getWritableDatabase();
            tempDB2.delete("main", "1", null);
            getContext().getContentResolver().notifyChange(myUri, null);


            for (int i = 0; i < destination.size(); i++) {
                int temp = destination.get(i).getOriginal();
                int temp2 = Integer.parseInt(portStr);
                if (temp == temp2) {
                    counter++;
                } else {
                    sending5 = "himdum" + "||||" + myPort + "||||" + "\"@\"" + "||||" + " ";
                    new SendMessageThread((destination.get(i).getOriginal() * 2), sending5);
                }

            }

        } else {

            String leal = null;
            try {
                leal = genHash(selection);
            } catch (NoSuchAlgorithmException ignored) {
            }


            String temp = "";
            String temp2 = hashFinder("5560");

            if (Compare(leal, temp2) <= 0) {
                for (int i = 0; i < avdList.size(); i++) {
                    temp = hashFinder("" + avdList.get(i));
                    if (Compare(leal, temp) <= 0) {
                        solppi = "" + (avdList.get(i) * 2);
                        break;
                    }
                }
            } else {
                solppi = "11124";
            }

            //  0     1     2     3     4
            //11108 11112 11116 11120 11124
            HashMap<String, String> MM3 = new HashMap<>();
            MM3.put(solppi, solppi);
            String FF = "";
            String SS = "";
            if (Compare(solppi, "11108") == 0) {
                Vector<Integer> tempVec = vector.get(0);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM3.put(FF, FF);
                MM3.put(SS, SS);
            } else if (Compare(solppi, "11112") == 0) {
                Vector<Integer> tempVec = vector.get(1);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM3.put(FF, FF);
                MM3.put(SS, SS);
            } else if (Compare(solppi, "11116") == 0) {
                Vector<Integer> tempVec = vector.get(2);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM3.put(FF, FF);
                MM3.put(SS, SS);
            } else if (Compare(solppi, "11120") == 0) {
                Vector<Integer> tempVec = vector.get(3);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM3.put(FF, FF);
                MM3.put(SS, SS);
            } else {
                Vector<Integer> tempVec = vector.get(4);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM3.put(FF, FF);
                MM3.put(SS, SS);
            }


            if (MM3.containsValue(myPort)) {
                MM3.remove(myPort);
                SQLiteDatabase tempDB5 = myDATA.getWritableDatabase();
                tempDB5.delete("main", "key" + "=?", new String[]{selection});

                getContext().getContentResolver().notifyChange(myUri, null);


            }
            counter++;
            System.out.println(counter);
            System.out.println(myPort);

            for (Map.Entry<String, String> e : MM3.entrySet()) {
                sending6 = "erase" + "||||" + myPort + "||||" + selection + "||||" + " ";
                int sending = Integer.parseInt(e.getValue());
                new SendMessageThread(sending, sending6);
            }
        }

        return 0;
    }

    @Override
    public String getType(Uri uri) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Uri insert(Uri uri, ContentValues values) {
        try {
            guman = genHash(values.get("key").toString());
        } catch (NoSuchAlgorithmException ignored) {
        }


        String enough = "";
        String temp = "";
        String temp2 = hashFinder("5560");

        if (Compare(guman, temp2) <= 0) {
            for (int i = 0; i < avdList.size(); i++) {
                temp = hashFinder("" + avdList.get(i));
                if (Compare(guman, temp) <= 0) {
                    enough = "" + (avdList.get(i) * 2);
                    break;
                }
            }
        } else {
            enough = "11124";
        }
        //  0     1     2     3     4
        //11108 11112 11116 11120 11124
        String FF = "";
        String SS = "";
        HashMap<String, String> MM2 = new HashMap<>();
        MM2.put(enough, enough);
        switch (enough) {
            case "11108":
                FF = "" + vector.get(0).get(0);
                SS = "" + vector.get(0).get(1);
                MM2.put(FF, FF);
                MM2.put(SS, SS);
                break;
            case "11112":
                FF = "" + vector.get(1).get(0);
                SS = "" + vector.get(1).get(1);
                MM2.put(FF, FF);
                MM2.put(SS, SS);
                break;
            case "11116":
                FF = "" + vector.get(2).get(0);
                SS = "" + vector.get(2).get(1);
                MM2.put(FF, FF);
                MM2.put(SS, SS);
                break;
            case "11120":
                FF = "" + vector.get(3).get(0);
                SS = "" + vector.get(3).get(1);
                MM2.put(FF, FF);
                MM2.put(SS, SS);
                break;
            case "11124" :
                FF = "" + vector.get(4).get(0);
                SS = "" + vector.get(4).get(1);
                MM2.put(FF, FF);
                MM2.put(SS, SS);
                break;
        }



        while (lockerA) {

        }
        makeATrue();
        llo = values.get("key").toString();
        firstFactor = "moo";
        choose = "boo";


        if (MM2.containsKey(myPort)) {
            MM2.remove(myPort);
            goGetIt(values);
            if (Compare(firstFactor, "moo") == 0) {
                firstFactor = "il";
            } else if (Compare(firstFactor, "il") == 0) {
                firstFactor = "ee";
            }
            System.out.println(counter);
            counter++;
        }

        for (Map.Entry<String, String> e : MM2.entrySet()) {
            sending4 = "insert" + "||||" + myPort + "||||" + values.get("key").toString() + "||||" + values.get("value").toString();
            int sending = Integer.parseInt(e.getValue());
            new SendMessageThread(sending, sending4);
        }

        while (Compare(choose, "boo") == 0) {

        }

        lockerA = false;

        return null;
    }

    public void goGetIt(ContentValues comeon) {

        SQLiteDatabase always = myDATA.getWritableDatabase();


        mybuilder2 = new SQLiteQueryBuilder();
        mybuilder2.setTables("main");
        myDatabase = myDATA.getWritableDatabase();


        myCursor = mybuilder2.query(myDatabase, null, "key" + "=?", new String[]{
                comeon.get("key").toString()
        }, null, null, null);

        myCursor.setNotificationUri(getContext().getContentResolver(), myUri);
        if (myCursor.getCount() != 0) {
            SQLiteDatabase aapcs = myDATA.getWritableDatabase();
            aapcs.update("main", comeon, "key" + "=?", new String[]{
                    comeon.get("key").toString()
            });
            getContext().getContentResolver().notifyChange(myUri, null);
        } else {
            always.insert("main", null, comeon);
        }

        getContext().getContentResolver().notifyChange(myUri, null);


    }

    @Override
    public boolean onCreate() {
//------------------------------------------------------------
        myDATA = new myDatabase(getContext());
        avdList.add(5562);
        avdList.add(5556);
        avdList.add(5554);
        avdList.add(5558);
        avdList.add(5560);
        temp1 = hashFinder("" + avdList.get(2)); //11108
        temp2 = hashFinder("" + avdList.get(1)); //11112
        temp3 = hashFinder("" + avdList.get(3)); //11116
        temp4 = hashFinder("" + avdList.get(4)); //11120
        temp5 = hashFinder("" + avdList.get(0)); //11124
        destination.add(new Destination(5554, 11116, 11118));
        destination.add(new Destination(5556, 11108, 11116));
        destination.add(new Destination(5558, 11118, 11120));
        destination.add(new Destination(5560, 11120, 11112));
        destination.add(new Destination(5562, 11112, 11108));
        Uri.Builder newUri = new Uri.Builder();
        newUri.authority("content");
        newUri.scheme("content://edu.buffalo.cse.cse486586.simpledynamo.provider");
        newUri.build();
        myUri = Uri.parse("content://edu.buffalo.cse.cse486586.simpledynamo.provider");
//------------------------------------------------------------


        TelephonyManager tel = (TelephonyManager) this.getContext().getSystemService(
                Context.TELEPHONY_SERVICE);
        portStr = tel.getLine1Number().substring(tel.getLine1Number().length() - 4);
        myPort = String.valueOf((Integer.parseInt(portStr) * 2));

        sub_vec1.add(11116);
        sub_vec1.add(11120);
        sub_vec2.add(11108);
        sub_vec2.add(11116);
        sub_vec3.add(11120);
        sub_vec3.add(11124);
        sub_vec4.add(11124);
        sub_vec4.add(11112);
        sub_vec5.add(11112);
        sub_vec5.add(11108);
        vector.add(sub_vec1);
        vector.add(sub_vec2);
        vector.add(sub_vec3);
        vector.add(sub_vec4);
        vector.add(sub_vec5);


        try {
            ServerSocket SERVER = new ServerSocket(10000);
            new ServerTask().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, SERVER);
        } catch (IOException ignored) {
        }


//Reference : http://stackoverflow.com/questions/11253067/check-if-database-is-empty-in-android
        try {
            System.out.println("unfamiliar one");
            check = SQLiteDatabase.openDatabase(getContext().getDatabasePath("myDB").getPath(),
                    null, SQLiteDatabase.OPEN_READONLY);
            System.out.println("check if it's working");
            check.close();
        } catch (SQLiteException ignored) {

        }
        if (check == null) {
            init = "nDefault";
        }

        if (Compare(init, "default") == 0) {

            Cursor vds = query(myUri, null, "\"*\"", null, null);
            cursorFinder(vds, "case2");
        }

        return false;
    }

    public synchronized void makeATrue() {
        counter++;
        lockerA = true;
    }

    public synchronized void makeBTrue() {
        counter++;
        lockerB = true;
    }

    @Override
    public Cursor query(Uri uri, String[] projection, String selection,
                        String[] selectionArgs, String sortOrder) {
        if (Compare(selection, "\"@\"") == 0) {


            while (lockerB) {

            }
            makeBTrue();


            SQLiteQueryBuilder mybuilder = new SQLiteQueryBuilder();
            mybuilder.setTables("main");
            SQLiteDatabase bbd = myDATA.getWritableDatabase();

            Cursor newCursor = null;

            newCursor = mybuilder.query(bbd, null, null, null, null, null, null);
            newCursor.setNotificationUri(getContext().getContentResolver(), uri);
            newCursor.moveToFirst();
            tc = new Vector<TargetCursor>();
            secondFactor = "young";
            doem = "boo2";
            for (int i = 0; i < newCursor.getCount(); i++) {
                int first = newCursor.getColumnIndex("key");
                int second = newCursor.getColumnIndex("value");
                String cFirst = newCursor.getString(first);
                String cSecond = newCursor.getString(second);
                TargetCursor newTC = new TargetCursor(cFirst, cSecond);
                tc.add(newTC);
                newCursor.moveToNext();
            }


            for (int i = 0; i < destination.size(); i++) {
                int temp = destination.get(i).getOriginal();
                int temp2 = Integer.parseInt(portStr);
                if (temp == temp2) {
                    counter++;
                } else {
                    sending = "havingfun" + "||||" + myPort + "||||" + selection + "||||" + " ";
                    new SendMessageThread((destination.get(i).getOriginal() * 2), sending);
                }

            }


            while (Compare(doem, "boo2") == 0) {

            }

            MatrixCursor newCursor2 = new MatrixCursor(new String[]{
                    "key", "value"
            });
            for (int i = 0; i < tc.size(); i++) {
                TargetCursor tempTC = tc.get(i);
                String first = tempTC.getFirst();
                String second = tempTC.getSecond();
                newCursor2.addRow(new String[]{
                        first, second
                });
            }
            tempCursor = newCursor2;

            if (Compare(selection, "\"@\"") == 0) {

                tempCursor = cursorFinder(tempCursor, "case1");
            }


            lockerB = false;

            return tempCursor;

        } else if (Compare(selection, "\"*\"") == 0) {


            while (lockerB) {

            }
            makeBTrue();
            SQLiteQueryBuilder mybuilder2 = new SQLiteQueryBuilder();
            mybuilder2.setTables("main");
            counter++;
            SQLiteDatabase bbdd = myDATA.getWritableDatabase();
            System.out.println(counter);
            Cursor newCursor2 = null;

            newCursor2 = mybuilder2.query(bbdd, null, null, null, null, null, null);
            System.out.println("After query");
            newCursor2.setNotificationUri(getContext().getContentResolver(), uri);
            counter++;
            System.out.println("After set notification");
            newCursor2.moveToFirst();
            System.out.println("After move to first");


            counter++;
            System.out.println(counter);

            secondFactor = "young";
            doem = "boo2";


            tc = new Vector<TargetCursor>();
            for (int i = 0; i < newCursor2.getCount(); i++) {
                int first = newCursor2.getColumnIndex("key");
                int second = newCursor2.getColumnIndex("value");
                String cFirst = newCursor2.getString(first);
                String cSecond = newCursor2.getString(second);
                TargetCursor newTC = new TargetCursor(cFirst, cSecond);
                tc.add(newTC);
                newCursor2.moveToNext();
            }


            for (int i = 0; i < destination.size(); i++) {
                int temp = destination.get(i).getOriginal();
                int temp2 = Integer.parseInt(portStr);
                if (temp == temp2) {
                    counter++;
                } else {
                    sending2 = "havingfun" + "||||" + myPort + "||||" + selection + "||||" + " ";
                    new SendMessageThread((destination.get(i).getOriginal() * 2), sending2);
                }

            }


            while (Compare(doem, "boo2") == 0) {

            }

            MatrixCursor newCursor3 = new MatrixCursor(new String[]{
                    "key", "value"
            });
            for (int i = 0; i < tc.size(); i++) {
                TargetCursor tempTC = tc.get(i);
                String first = tempTC.getFirst();
                String second = tempTC.getSecond();
                newCursor3.addRow(new String[]{
                        first, second
                });
            }
            tempCursor = newCursor3;

            if (Compare(selection, "\"@\"") == 0) {

                tempCursor = cursorFinder(tempCursor, "case1");
            }


            lockerB = false;

            return tempCursor;

        } else {

            String tempHash = null;
            try {
                tempHash = genHash(selection);
            } catch (NoSuchAlgorithmException ignored) {
            }


            String newSend = "";
            String temp = "";
            String temp2 = hashFinder("5560");

            if (Compare(tempHash, temp2) <= 0) {
                for (int i = 0; i < avdList.size(); i++) {
                    temp = hashFinder("" + avdList.get(i));
                    if (Compare(tempHash, temp) <= 0) {
                        newSend = "" + (avdList.get(i) * 2);
                        break;
                    }
                }
            } else {
                newSend = "11124";
            }

            //  0     1     2     3     4
            //11108 11112 11116 11120 11124
            Map<String, String> MM = new HashMap<String, String>();
            String FF = "";
            String SS = "";
            System.out.println("Checking if MM is working properly");
            MM.put(newSend, newSend);
            if (Compare(newSend, "11108") == 0) {
                Vector<Integer> tempVec = vector.get(0);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM.put(FF, FF);
                MM.put(SS, SS);
            } else if (Compare(newSend, "11112") == 0) {
                Vector<Integer> tempVec = vector.get(1);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM.put(FF, FF);
                MM.put(SS, SS);
            } else if (Compare(newSend, "11116") == 0) {
                Vector<Integer> tempVec = vector.get(2);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM.put(FF, FF);
                MM.put(SS, SS);
            } else if (Compare(newSend, "11120") == 0) {
                Vector<Integer> tempVec = vector.get(3);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM.put(FF, FF);
                MM.put(SS, SS);
            } else {
                Vector<Integer> tempVec = vector.get(4);
                FF = "" + tempVec.get(0);
                SS = "" + tempVec.get(1);
                MM.put(FF, FF);
                MM.put(SS, SS);
            }


            while (lockerB) {

            }
            makeBTrue();


            if (MM.containsKey(myPort)) {


                SQLiteQueryBuilder mybuilder = new SQLiteQueryBuilder();
                mybuilder.setTables("main");
                SQLiteDatabase database = myDATA.getWritableDatabase();

                Cursor cursor = null;


                cursor = mybuilder.query(database, null, "key" + "=?", new String[]{
                        selection
                }, null, null, null);

                cursor.setNotificationUri(getContext().getContentResolver(), uri);
                String alim = "yes";
                if (cursor.moveToFirst()) {
                    if (cursor.getString(1) == null) {
                        alim = "no";
                    }
                    if (Compare(cursor.getString(1).trim(), "") == 0) {
                        alim = "no";
                    }
                } else {
                    alim = "no";
                }


                if (Compare(alim, "yes") == 0) {
                    lockerB = false;
                    return cursor;
                } else {
                    MM.remove(myPort);
                }
            }


            tc = new Vector<TargetCursor>();
            doem = "boo2";
            byul = selection;

            for (Map.Entry<String, String> e : MM.entrySet()) {
                sending3 = "query" + "||||" + myPort + "||||" + selection + "||||" + " ";
                int sending = Integer.parseInt(e.getValue());
                new SendMessageThread(sending, sending3);
            }


            while (Compare(doem, "boo2") == 0) {

            }


            MatrixCursor newCursor = new MatrixCursor(new String[]{
                    "key", "value"
            });
            for (int i = 0; i < tc.size(); i++) {
                TargetCursor tempTC = tc.get(i);
                String first = tempTC.getFirst();
                String second = tempTC.getSecond();
                newCursor.addRow(new String[]{
                        first, second
                });
            }


            lockerB = false;

            return newCursor;
        }
    }

    public Cursor cursorFinder(Cursor fCursor, String s) {
        nakkim = null;
        nakim = null;
        mfH = null;
        if (Compare(s, "case1") == 0) {
            mfCur = new MatrixCursor(new String[]{
                    "key", "value"
            });

            if (fCursor.moveToFirst()) {

                do {
                    nakim = fCursor.getString(0);
                    nakkim = fCursor.getString(1);
                    System.out.println(fCursor.getString(0));
                    try {
                        mfH = genHash(nakim);
                    } catch (NoSuchAlgorithmException ignored) {
                    }
                    System.out.println(mfH + " Created");
                    if (Compare(portStr, "" + avdList.get(2)) == 0) {
                        if (Compare(temp1, mfH) >= 0
                                || Compare(temp4, mfH) < 0) {
                            System.out.println("Compare(portStr, \"\" + avdList.get(2)) == 0");
                            mfCur.addRow(new String[]{
                                    nakim, nakkim
                            });
                        }
                    } else if (Compare(portStr, "" + avdList.get(1)) == 0) {
                        if (Compare(temp2, mfH) >= 0
                                || Compare(temp3, mfH) < 0) {
                            System.out.println("Compare(portStr, \"\" + avdList.get(1)) == 0");
                            mfCur.addRow(new String[]{
                                    nakim, nakkim
                            });
                        }
                    } else if (Compare(portStr, "" + avdList.get(3)) == 0) {
                        if (Compare(temp3, mfH) >= 0
                                && Compare(temp5, mfH) < 0) {
                            System.out.println("Compare(portStr, \"\" + avdList.get(3)) == 0");
                            mfCur.addRow(new String[]{
                                    nakim, nakkim
                            });
                        }
                    } else if (Compare(portStr, "" + avdList.get(4)) == 0) {
                        if (Compare(temp4, mfH) >= 0
                                && Compare(temp2, mfH) < 0) {
                            System.out.println("Compare(portStr, \"\" + avdList.get(4)) == 0");
                            mfCur.addRow(new String[]{
                                    nakim, nakkim
                            });
                        }
                    } else if (Compare(portStr, "key") == 0) {
                        if (Compare(temp1, mfH) >= 0
                                || Compare(temp4, mfH) < 0) {
                            System.out.println("Compare(portStr,\"key\") == 0");
                            mfCur.addRow(new String[]{
                                    nakim, nakkim
                            });
                        }
                    } else if (Compare(portStr, "value") == 0) {
                        if (Compare(temp3, mfH) >= 0
                                && Compare(temp5, mfH) < 0) {
                            System.out.println("Compare(portStr, \"value\") == 0");
                            mfCur.addRow(new String[]{nakim, nakkim
                            });
                        }
                    } else if (Compare(portStr, "null") == 0) {
                        System.out.println("error");

                    } else if (Compare(portStr, "" + avdList.get(0)) == 0) {
                        if (Compare(temp5, mfH) >= 0
                                || Compare(temp1, mfH) < 0) {
                            System.out.println("Compare(portStr, \"\" + avdList.get(0)) == 0");
                            mfCur.addRow(new String[]{
                                    nakim, nakkim
                            });
                        }
                    }
                } while (fCursor.moveToNext());
            }

            return mfCur;
        } else if (Compare(portStr, "value") == 0) {
            counter++;
            return null;

        } else {


            if (fCursor.moveToFirst()) {
                do {
                    try {
                        mfH = genHash(fCursor.getString(0));
                    } catch (NoSuchAlgorithmException ignored) {
                    }
                    if (Compare(portStr, "" + avdList.get(2)) == 0) {
                        if (Compare(temp1, mfH) >= 0
                                || Compare(temp4, mfH) < 0) {
                            ContentValues mfcv = new ContentValues();
                            mfcv.put("key", fCursor.getString(0));
                            mfcv.put("value", fCursor.getString(1));
                            goGetIt(mfcv);
                        }
                    } else if (Compare(portStr, "" + avdList.get(1)) == 0) {
                        if (Compare(temp2, mfH) >= 0
                                || Compare(temp3, mfH) < 0) {
                            ContentValues mfcv2 = new ContentValues();
                            mfcv2.put("key", fCursor.getString(0));
                            mfcv2.put("value", fCursor.getString(1));
                            goGetIt(mfcv2);
                        }
                    } else if (Compare(portStr, "" + avdList.get(3)) == 0) {
                        if (Compare(temp3, mfH) >= 0
                                && Compare(temp5, mfH) < 0) {
                            ContentValues mfcv3 = new ContentValues();
                            mfcv3.put("key", fCursor.getString(0));
                            mfcv3.put("value", fCursor.getString(1));
                            goGetIt(mfcv3);
                        }
                    } else if (Compare(portStr, "" + avdList.get(4)) == 0) {
                        if (Compare(temp4, mfH) >= 0
                                && Compare(temp2, mfH) < 0) {
                            ContentValues mfcv4 = new ContentValues();
                            mfcv4.put("key", fCursor.getString(0));
                            mfcv4.put("value", fCursor.getString(1));
                            goGetIt(mfcv4);
                        }
                    } else if (Compare(portStr, "" + avdList.get(0)) == 0) {
                        if (Compare(temp5, mfH) >= 0
                                || Compare(temp1, mfH) < 0) {
                            ContentValues mfcv5 = new ContentValues();
                            mfcv5.put("key", fCursor.getString(0));
                            mfcv5.put("value", fCursor.getString(1));
                            goGetIt(mfcv5);
                        }
                    }

                } while (fCursor.moveToNext());
            }
            return null;
        }

    }

    private String hashFinder(String s) {
        if (s.equals("5562")) {
            return "177ccecaec32c54b82d5aaafc18a2dadb753e3b1";
        } else if (s.equals("5556")) {
            return "208f7f72b198dadd244e61801abe1ec3a4857bc9";
        } else if (s.equals("5554")) {
            return "33d6357cfaaf0f72991b0ecd8c56da066613c089";
        } else if (s.equals("5558")) {
            return "abf0fd8db03e5ecb199a9b82929e9db79b909643";
        } else if (s.equals("5560")) {
            return "c25ddd596aa7c81fa12378fa725f706d54325d12";
        } else if (s.equals("177ccecaec32c54b82d5aaafc18a2dadb753e3b1")) {
            return "5562";
        } else if (s.equals("208f7f72b198dadd244e61801abe1ec3a4857bc9")) {
            return "5556";
        } else if (s.equals("33d6357cfaaf0f72991b0ecd8c56da066613c089")) {
            return "5554";
        } else if (s.equals("abf0fd8db03e5ecb199a9b82929e9db79b909643")) {
            return "5558";
        } else if (s.equals("c25ddd596aa7c81fa12378fa725f706d54325d12")) {
            return "5560";
        } else if (s.equals("11124")) {
            return "177ccecaec32c54b82d5aaafc18a2dadb753e3b1";
        } else if (s.equals("11112")) {
            return "208f7f72b198dadd244e61801abe1ec3a4857bc9";
        } else if (s.equals("11108")) {
            return "33d6357cfaaf0f72991b0ecd8c56da066613c089";
        } else if (s.equals("11116")) {
            return "abf0fd8db03e5ecb199a9b82929e9db79b909643";
        } else {
            return "c25ddd596aa7c81fa12378fa725f706d54325d12";
        }
    }

    public int Compare(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int max = 0;
        if (length1 <= length2) {
            max = length1;
        } else
            max = length2;
        int count = 0;


        for (int i = 0; i < max; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (str2.charAt(i) > str1.charAt(i)) {
                return -1;
            }
            if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            }
        }
        if (length1 == length2) {
            return 0;
        } else if (length1 < length2) {
            return -1;
        } else {
            return 1;
        }

    }

    @Override
    public int update(Uri uri, ContentValues values, String selection,
                      String[] selectionArgs) {
        // TODO Auto-generated method stub
        return 0;
    }

    private String genHash(String input) throws NoSuchAlgorithmException {
        MessageDigest sha1 = MessageDigest.getInstance("SHA-1");
        byte[] sha1Hash = sha1.digest(input.getBytes());
        Formatter formatter = new Formatter();
        for (byte b : sha1Hash) {
            formatter.format("%02x", b);
        }
        return formatter.toString();
    }

    private class ServerTask extends AsyncTask<ServerSocket, String, Void> {

        @Override
        protected Void doInBackground(ServerSocket... sockets) {

            ServerSocket serverSocket = sockets[0];


            try {

                while (null != serverSocket) {

                    Socket SOC = serverSocket.accept();

                    InputStream inputstream = SOC.getInputStream();
                    DataInputStream in = new DataInputStream(new BufferedInputStream(inputstream));

                    String MESSAGE = null;
                    if (null == (MESSAGE = in.readUTF())) {
                        return null;
                    } else {
                        String[] msgs = MESSAGE.split("\\|\\|\\|\\|");
                        String tem0 = msgs[0]; //getMessageType
                        String tem1 = msgs[1]; //
                        String tem2 = msgs[2];
                        String tem3 = msgs[3];


                        if (Compare(tem0, "himdum") == 0) {
                            SQLiteDatabase tempDB3 = myDATA.getWritableDatabase();
                            tempDB3.delete("main", "1", null);
                            getContext().getContentResolver().notifyChange(myUri, null);
                        } else if (Compare(tem0, "erase") == 0) {
                            SQLiteDatabase tempDB4 = myDATA.getWritableDatabase();
                            tempDB4.delete("main", "key" + "=?", new String[]{tem2});

                            getContext().getContentResolver().notifyChange(myUri, null);
                        } else if (Compare(tem0, "insert") == 0) {
                            ContentValues cccvvv = new ContentValues();
                            cccvvv.put("key", tem2);
                            cccvvv.put("value", tem3);
                            goGetIt(cccvvv);
                            sending7 = "sunggong" + "||||" + myPort + "||||" + tem2 + "||||" + " ";
                            int sending = Integer.parseInt(tem1);
                            new SendMessageThread(sending, sending7);

                        } else if (Compare(tem0, "sunggong") == 0) {

                            if (Compare(tem2, llo) == 0) {
                                if (lockerA) {
                                    if ((Compare(firstFactor, "moo") == 0 || Compare(firstFactor, "il") == 0) && Compare(choose, "boo") == 0) {
                                        firstFactor = "ee";
                                        if (Compare(firstFactor, "ee") == 0) {
                                            choose = "gung";
                                        }
                                    }
                                }
                            }

                        } else if (Compare(tem0, "query") == 0) {
                            myBuilder = new SQLiteQueryBuilder();
                            myBuilder.setTables("main");
                            myDB = myDATA.getWritableDatabase();


                            dCursor = myBuilder.query(myDB, null, "key" + "=?", new String[]{
                                    tem2
                            }, null, null, null);

                            dCursor.setNotificationUri(getContext().getContentResolver(), myUri);

                            sb = "";
                            if (dCursor.moveToFirst()) {
                                do {
                                    sb += dCursor.getString(0) + "!" + dCursor.getString(1) + "+";

                                } while (dCursor.moveToNext());
                            }
                            if (Compare(sb, "") == 0) {
                                sb = " ";
                            } else {
                                sb = sb.substring(0, sb.length() - 1);
                            }
                            sending8 = "dado" + "||||" + myPort + "||||" + tem2 + "||||" + sb;
                            int sending = Integer.parseInt(tem1);
                            new SendMessageThread(sending, sending8);

                        } else if (Compare(tem0, "havingfun") == 0) {
                            myBuilder2 = new SQLiteQueryBuilder();
                            myBuilder2.setTables("main");
                            myDB2 = myDATA.getWritableDatabase();


                            dCursor2 = myBuilder2.query(myDB2, null, null, null, null, null, null);


                            dCursor2.setNotificationUri(getContext().getContentResolver(), myUri);

                            sb2 = "";
                            if (dCursor2.moveToFirst()) {
                                do {
                                    sb2 += dCursor2.getString(0) + "!" + dCursor2.getString(1) + "+";
                                } while (dCursor2.moveToNext());
                            }
                            if (Compare(sb2, "") == 0) {
                                sb2 = " ";
                            } else {
                                sb2 = sb2.substring(0, sb2.length() - 1);
                            }
                            sending9 = "almostDone" + "||||" + myPort + "||||" + tem2 + "||||" + sb2;
                            int sending = Integer.parseInt(tem1);
                            new SendMessageThread(sending, sending9);

                        } else if (Compare(tem0, "almostDone") == 0) {

                            if (lockerB) {

                                if ((Compare(secondFactor, "young") == 0 || Compare(secondFactor, "hana") == 0
                                        || Compare(secondFactor, "dool") == 0) && Compare(doem, "boo2") == 0) {

                                    if (tem3 != null) {
                                        if (tem3.trim().length() > 0) {
                                            String[] temp = tem3.split("\\+");
                                            for (int i = 0; i < temp.length; i++) {
                                                String first = temp[i].split("!")[0];
                                                String second = temp[i].split("!")[1];
                                                TargetCursor newTC = new TargetCursor(first, second);
                                                tc.add(newTC);
                                            }
                                        }
                                    }
                                    if (Compare(secondFactor, "young") == 0) {
                                        secondFactor = "hana";
                                    } else if (Compare(secondFactor, "hana") == 0) {
                                        secondFactor = "dool";
                                    } else if (Compare(secondFactor, "dool") == 0) {
                                        secondFactor = "set";
                                    }
                                    if (Compare(secondFactor, "set") == 0) {
                                        doem = "muenga";
                                    }
                                }
                            }

                        } else if (Compare(tem0, "dado") == 0) {
                            if (Compare(tem2, byul) == 0) {
                                int ccc = 0;
                                matCursor = new MatrixCursor(new String[]{
                                        "key", "value"
                                });


                                if (null != tem3) {
                                    if (!(tem3.trim().length() <= 0)) {
                                        String[] messages = tem3.split("\\+");
                                        for (int i = 0; i < messages.length; i++) {
                                            ccc++;
                                            temp6 = messages[i].split("!")[0];
                                            temp7 = messages[i].split("!")[1];
                                            matCursor.addRow(new String[]{
                                                    temp6, temp7
                                            });
                                        }
                                    }
                                }
                                if (ccc != 0) {

                                    if (lockerB) {
                                        if (Compare(doem, "boo2") == 0) {
                                            if (tem3 != null) {
                                                if (tem3.trim().length() > 0) {
                                                    String[] temp = tem3.split("\\+");
                                                    for (int i = 0; i < temp.length; i++) {
                                                        String first = temp[i].split("!")[0];
                                                        String second = temp[i].split("!")[1];
                                                        TargetCursor newTC = new TargetCursor(first, second);
                                                        tc.add(newTC);
                                                    }
                                                }
                                            }
                                            doem = "some";
                                        }
                                    }
                                }
                            }
                        }

                    }
                }
            } catch (IOException | NumberFormatException ignored) {
            }

            return null;

        }
    }

    private class SendMessageThread extends Thread {


        String content;

        Integer toSend;

        SendMessageThread(Integer g, String s) {
            this.toSend = g;
            content = s;
            start();
        }

        public void run() {

            try {

                Socket socket = new Socket(InetAddress.getByAddress(new byte[]{
                        10, 0, 2, 2
                }), toSend);

                //socket.setSoTimeout(350);
                socket.setTcpNoDelay(true);
                System.out.println("Testing setTcpNoDelay");
                DataOutputStream dos =
                        new DataOutputStream(
                                new BufferedOutputStream(socket.getOutputStream()));
                System.out.println(counter);
                dos.writeUTF(content);
                System.out.println("Before send");
                dos.flush();
                System.out.println("After send");
                dos.close();

                socket.close();

            } catch (Exception ignored) {

            }
        }
    }

    public class myDatabase extends SQLiteOpenHelper {
        private String CREATE = "create table " + "main" + "(" + "key"
                + " text not null, " + "value" + " text not null);";


        public myDatabase(Context context) {
            super(context, "myDB", null, 1);
        }


        @Override
        public void onCreate(SQLiteDatabase db) {
            db.execSQL(CREATE);
        }


        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS " + "main");
            onCreate(db);
        }

    }
}
