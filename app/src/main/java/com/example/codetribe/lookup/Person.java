package com.example.codetribe.lookup;

import java.util.Date;

/**
 * Created by Code Tribe on 2016/09/13.
 */
public class Person {

        private String names;
        private String dateOFB;
        private String gender;
        public Person()
        {

        }
    public Person(String names,String dateOFB,String gender){
        this.names = names;
        this.dateOFB = dateOFB;
        this.gender = gender;
    }


        private String getNames()
        {
            return names;
        }

        private String getDateOFB()
        {
            return  dateOFB;
        }
        private  String getGender()
    {
        return gender;
    }
}
