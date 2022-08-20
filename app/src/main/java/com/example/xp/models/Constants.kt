package com.example.xp.models

import com.example.xp.R

object Constants {

    //constants for capturing user info and score for sharedPref
    val USER_NAME: String = "username"
    val HIGH_SCORE: String = "lastresult"

    //method that will return the questions
    fun getCodQuestions() : ArrayList<Question> {
        //Create our empty ArrayList
        var allQuestions = ArrayList<Question>()

        val que1 = Question(
            1,
            "What is the name of this player",
            R.drawable.scump,
            "Ian",
            "Seth",
            "James",
            "Abner",
            "Seth"

        )

        val que2 = Question(
            2,
            "Who won the most CWL Rings?",
            R.drawable.cod_que2,
            "Scump",
            "Clayster",
            "Crimsix",
            "Formal",
            "Crimsix"
        )

        val que3 = Question(
            3,
            "Who won the 2019 CWL final?",
            R.drawable.cod_que3,
            "Optic Gaming",
            "EUnited",
            "FaZe Clan",
            "Splyce Gaming",
            "EUnited"
        )

        val que4 = Question(
            4,
            "When was the first Call of Duty Released?",
            R.drawable.cod_que4,
            "2003",
            "2007",
            "2010",
            "2005",
            "2003"
        )

        val que5 = Question(
            5,
            "Which CoD series introduced Exo Suits?",
            R.drawable.cod_que5,
            "Black Ops",
            "World At War",
            "Infinite Warfare",
            "Advanced Warfare",
            "Advanced Warfare"
        )

        allQuestions.add(que1)
        allQuestions.add(que2)
        allQuestions.add(que3)
        allQuestions.add(que4)
        allQuestions.add(que5)

        return allQuestions
    }

    fun getCsgoQuestions(): ArrayList<Question> {
        var csgoQuestions = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which team won ESL One New York 2016?",
            //insert image for question,
            R.drawable.csgo_que1,
            "Astralis",
            "FaZe Clan",
            "Na`Vi",
            "EnVyUs",
            "Astralis"
        )

        val que2 = Question(
            2,
            "How many hours does s1mple have in CSGO?",
            //insert image for question,
            R.drawable.csgo_que2,
            "16 000",
            "12 000",
            "24 000",
            "18 000",
            "16 000"
        )

        val que3 = Question(
            3,
            "Which player has the highest earnings?",
            //insert image for question,
            R.drawable.csgo_que3,
            "dupreeh",
            "s1mple",
            "Twistzz",
            "Xyp9x",
            "dupreeh"
        )

        val que4 = Question(
            4,
            "Which Counter Strike was the first esports?",
            //insert image for question,
            R.drawable.csgo_que4,
            "CS 1.6",
            "CS Source",
            "CS:GO",
            "CS",
            "CS Source"

        )

        val que5 = Question(
            5,
            "What was the 2019 IEM Katowice Attendance?",
            //insert image for question,
            R.drawable.csgo_que5,
            "175 000",
            "120 000",
            "200 000",
            "125 000",
            "175 000"
        )

        csgoQuestions.add(que1)
        csgoQuestions.add(que2)
        csgoQuestions.add(que3)
        csgoQuestions.add(que4)
        csgoQuestions.add(que5)

        return csgoQuestions
    }

    fun getFortniteQuestions(): ArrayList<Question> {
        var fortniteQuestions = ArrayList<Question>()

        val que1 = Question(
            1,
            "Who was the fortnite World Cup Winner?",
            //insert image for question,
            R.drawable.fn_que1,
            "Bugha",
            "Tfue",
            "Cloakzy",
            "Clix",
            "Bugha"
        )

        val que2 = Question(
            2,
            "What was the World Cup Prize Pool?",
            //insert image for question,
            R.drawable.fn_que2,
            "$30 Million",
            "$2 Million",
            "$25 Million",
            "$10 Million",
            "$30 Million"
        )

        val que3 = Question(
            3,
            "Which team has the best players?",
            //insert image for question,
            R.drawable.fn_que3,
            "Faze Clan",
            "NRG",
            "Team Liquid",
            "Misfits Gaming",
            "FaZe Clan"
        )

        val que4 = Question(
            4,
            "What is this player notorious for?",
            //insert image for question,
            R.drawable.fn_que4,
            "Aim",
            "Building",
            "Macros",
            "Movement",
            "Aim"
        )

        val que5 = Question(
            5,
            "When did Fortnite release?",
            //insert image for question,
            R.drawable.fn_que5,
            "July 2017",
            "September 2017",
            "August 2017",
            "June 2017",
            "July 2017"
        )

        fortniteQuestions.add(que1)
        fortniteQuestions.add(que2)
        fortniteQuestions.add(que3)
        fortniteQuestions.add(que4)
        fortniteQuestions.add(que5)

        return fortniteQuestions
    }

    fun getLeagueQuestions(): ArrayList<Question> {
        var leagueQuestions = ArrayList<Question>()

        val que1 = Question(
            1,
            "In which year was League of Legends officially launched?",
            //insert image for question,
            R.drawable.lol_que1,
            "2009",
            "2008",
            "2011",
            "2013",
            "2009"
        )

        val que2 = Question(
            2,
            "In which city did the 2018 final take place?",
            //insert image for question,
            R.drawable.lol_que2,
            "Busan",
            "Seoul",
            "Daejon",
            "Incheon",
            "Seoul"
        )

        val que3 = Question(
            3,
            "Who is the player with the most titles?",
            //insert image for question,
            R.drawable.lol_que3,
            "Caps",
            "Faker",
            "Bjergsen",
            "Uzi",
            "Faker"
        )

        val que4 = Question(
            4,
            "How far did Cloud9 progress at Worlds 2018?",
            //insert image for question,
            R.drawable.lol_que4,
            "Quarters",
            "Semi's",
            "Knockout",
            "Final",
            "Semi's"

        )

        val que5 = Question(
            5,
            "What is the name of this player?",
            //insert image for question,
            R.drawable.faker,
            "Uzi",
            "Faker",
            "Bengi",
            "Showmaker",
            "Faker"
        )

        leagueQuestions.add(que1)
        leagueQuestions.add(que2)
        leagueQuestions.add(que3)
        leagueQuestions.add(que4)
        leagueQuestions.add(que5)

        return leagueQuestions
    }

    fun getOverwatchQuestions(): ArrayList<Question> {
        var overwatchQuestions = ArrayList<Question>()

        val que1 = Question(
            1,
            "Which player was famously banned?",
            //insert image for question,
            R.drawable.ow_que1,
            "Dafran",
            "Sinatraa",
            "xQc",
            "Provide",
            "xQc"
        )

        val que2 = Question(
            2,
            "What mouse sensitivity does Dafran play on?",
            //insert image for question,
            R.drawable.ow_que2,
            "8.5",
            "5.5",
            "7",
            "5.42",
            "5.5"
        )

        val que3 = Question(
            3,
            "Which team had an undefeated stage streak",
            //insert image for question,
            R.drawable.ow_que3,
            "Boston Uprising",
            "SF Shock",
            "Dallas Fuel",
            "LA Gladiators",
            "Dallas Fuel"
        )

        val que4 = Question(
            4,
            "What was Sinatraa's favourite hero?",
            //insert image for question,
            R.drawable.ow_que4,
            "Soldier: 76",
            "Widowmaker",
            "Tracer",
            "Doomfist",
            "Tracer"
        )

        val que5 = Question(
            5,
            "Which company created Overwatch?",
            //insert image for question,
            R.drawable.ow_que5,
            "Activision",
            "Blizzard",
            "EA",
            "Ubisoft",
            "Blizzard"
        )

        overwatchQuestions.add(que1)
        overwatchQuestions.add(que2)
        overwatchQuestions.add(que3)
        overwatchQuestions.add(que4)
        overwatchQuestions.add(que5)

        return overwatchQuestions
    }

    fun getValorantQuestions(): ArrayList<Question> {
        var valorantQuestions = ArrayList<Question>()

        val que1 = Question(
            1,
            "What team does Shroud play for?",
            //insert image for question,
            R.drawable.val_que1,
            "CLG Red",
            "Sentinels",
            "Dignitas",
            "Acend",
            "Sentinels"
        )

        val que2 = Question(
            2,
            "How many teams were in 2021 Berlin?",
            //insert image for question,
            R.drawable.val_que2,
            "15",
            "13",
            "10",
            "18",
            "13"
        )

        val que3 = Question(
            3,
            "What team is not part of the NA Region?",
            //insert image for question,
            R.drawable.val_que3,
            "Sentinels",
            "Team Liquid",
            "Team Envy",
            "Cloud9",
            "Team Envy"
        )

        val que4 = Question(
            4,
            "Which team won the NA Valorant LCQ?",
            //insert image for question,
            R.drawable.val_que4,
            "100 Thieves",
            "Sentinels",
            "The Guard",
            "Team Liquid",
            "100 Thieves"
        )

        val que5 = Question(
            5,
            "What is the most used gun?",
            //insert image for question,
            R.drawable.val_que5,
            "Operator",
            "Phantom",
            "Stinger",
            "Vandal",
            "Vandal"

        )

        valorantQuestions.add(que1)
        valorantQuestions.add(que2)
        valorantQuestions.add(que3)
        valorantQuestions.add(que4)
        valorantQuestions.add(que5)

        return valorantQuestions
    }
}