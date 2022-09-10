package com.example.topmovieapp.data

import com.example.topmovieapp.models.Movie
import com.example.topmovieapp.models.MovieRes
import com.google.gson.Gson
import java.lang.IllegalStateException

class ApiServiceImpl: ApiService {

    override suspend fun getMovies(): List<Movie> {
        val gson = Gson()
        return gson.fromJson(mockdata, MovieRes::class.java).movieList ?: throw IllegalStateException()
    }

    val mockdata = "{\n" +
            "  \"dates\": {\n" +
            "    \"maximum\": \"2022-09-15\",\n" +
            "    \"minimum\": \"2022-07-29\"\n" +
            "  },\n" +
            "  \"page\": 1,\n" +
            "  \"results\": [\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/rqgeBNWXas1yrAyXxwi9CahfScx.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        53\n" +
            "      ],\n" +
            "      \"id\": 985939,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Fall\",\n" +
            "      \"overview\": \"For best friends Becky and Hunter, life is all about conquering fears and pushing limits. But after they climb 2,000 feet to the top of a remote, abandoned radio tower, they find themselves stranded with no way down. Now Becky and Hunter’s expert climbing skills will be put to the ultimate test as they desperately fight to survive the elements, a lack of supplies, and vertigo-inducing heights.\",\n" +
            "      \"popularity\": 4808.091,\n" +
            "      \"poster_path\": \"/9f5sIJEgvUpFv0ozfA6TurG4j22.jpg\",\n" +
            "      \"release_date\": \"2022-08-11\",\n" +
            "      \"title\": \"Fall\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.4,\n" +
            "      \"vote_count\": 293\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/xfNHRI2f5kHGvogxLd0C5sB90L7.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        16,\n" +
            "        28,\n" +
            "        10751,\n" +
            "        878,\n" +
            "        35\n" +
            "      ],\n" +
            "      \"id\": 539681,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"DC League of Super-Pets\",\n" +
            "      \"overview\": \"When Superman and the rest of the Justice League are kidnapped, Krypto the Super-Dog must convince a rag-tag shelter pack - Ace the hound, PB the potbellied pig, Merton the turtle and Chip the squirrel - to master their own newfound powers and help him rescue the superheroes.\",\n" +
            "      \"popularity\": 2479.833,\n" +
            "      \"poster_path\": \"/r7XifzvtezNt31ypvsmb6Oqxw49.jpg\",\n" +
            "      \"release_date\": \"2022-07-27\",\n" +
            "      \"title\": \"DC League of Super-Pets\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.6,\n" +
            "      \"vote_count\": 457\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/xVbppM1xgbskOKgOuV8fbWBWHtt.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        27,\n" +
            "        9648,\n" +
            "        878,\n" +
            "        53\n" +
            "      ],\n" +
            "      \"id\": 762504,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Nope\",\n" +
            "      \"overview\": \"Residents in a lonely gulch of inland California bear witness to an uncanny, chilling discovery.\",\n" +
            "      \"popularity\": 1590.384,\n" +
            "      \"poster_path\": \"/AcKVlWaNVVVFQwro3nLXqPljcYA.jpg\",\n" +
            "      \"release_date\": \"2022-07-20\",\n" +
            "      \"title\": \"Nope\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.1,\n" +
            "      \"vote_count\": 1294\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/nmGWzTLMXy9x7mKd8NKPLmHtWGa.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        16,\n" +
            "        12,\n" +
            "        35,\n" +
            "        14\n" +
            "      ],\n" +
            "      \"id\": 438148,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Minions: The Rise of Gru\",\n" +
            "      \"overview\": \"A fanboy of a supervillain supergroup known as the Vicious 6, Gru hatches a plan to become evil enough to join them, with the backup of his followers, the Minions.\",\n" +
            "      \"popularity\": 1766.772,\n" +
            "      \"poster_path\": \"/wKiOkZTN9lUUUNZLmtnwubZYONg.jpg\",\n" +
            "      \"release_date\": \"2022-06-29\",\n" +
            "      \"title\": \"Minions: The Rise of Gru\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.7,\n" +
            "      \"vote_count\": 1864\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/ugS5FVfCI3RV0ZwZtBV3HAV75OX.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        16,\n" +
            "        878,\n" +
            "        28\n" +
            "      ],\n" +
            "      \"id\": 610150,\n" +
            "      \"original_language\": \"ja\",\n" +
            "      \"original_title\": \"ドラゴンボール超 スーパーヒーロー\",\n" +
            "      \"overview\": \"The Red Ribbon Army, an evil organization that was once destroyed by Goku in the past, has been reformed by a group of people who have created new and mightier Androids, Gamma 1 and Gamma 2, and seek vengeance against Goku and his family.\",\n" +
            "      \"popularity\": 5609.525,\n" +
            "      \"poster_path\": \"/rugyJdeoJm7cSJL1q4jBpTNbxyU.jpg\",\n" +
            "      \"release_date\": \"2022-06-11\",\n" +
            "      \"title\": \"Dragon Ball Super: Super Hero\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 8,\n" +
            "      \"vote_count\": 1398\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/rwgmDkIEv8VjAsWx25ottJrFvpO.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        10749,\n" +
            "        18\n" +
            "      ],\n" +
            "      \"id\": 744276,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"After Ever Happy\",\n" +
            "      \"overview\": \"As a shocking truth about a couple's families emerges, the two lovers discover they are not so different from each other. Tessa is no longer the sweet, simple, good girl she was when she met Hardin — any more than he is the cruel, moody boy she fell so hard for.\",\n" +
            "      \"popularity\": 1359.901,\n" +
            "      \"poster_path\": \"/moogpu8rNkEjTgFyLXwhPghft5w.jpg\",\n" +
            "      \"release_date\": \"2022-08-24\",\n" +
            "      \"title\": \"After Ever Happy\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 6.5,\n" +
            "      \"vote_count\": 46\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/AfvIjhDu9p64jKcmohS4hsPG95Q.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        27,\n" +
            "        53\n" +
            "      ],\n" +
            "      \"id\": 756999,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"The Black Phone\",\n" +
            "      \"overview\": \"Finney Blake, a shy but clever 13-year-old boy, is abducted by a sadistic killer and trapped in a soundproof basement where screaming is of little use. When a disconnected phone on the wall begins to ring, Finney discovers that he can hear the voices of the killer’s previous victims. And they are dead set on making sure that what happened to them doesn’t happen to Finney.\",\n" +
            "      \"popularity\": 1291.64,\n" +
            "      \"poster_path\": \"/lr11mCT85T1JanlgjMuhs9nMht4.jpg\",\n" +
            "      \"release_date\": \"2022-06-22\",\n" +
            "      \"title\": \"The Black Phone\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.9,\n" +
            "      \"vote_count\": 2391\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/3VQj6m0I6gkuRaljmhNZl0XR3by.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        16,\n" +
            "        12,\n" +
            "        35,\n" +
            "        14\n" +
            "      ],\n" +
            "      \"id\": 585511,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Luck\",\n" +
            "      \"overview\": \"Suddenly finding herself in the never-before-seen Land of Luck, the unluckiest person in the world must unite with the magical creatures there to turn her luck around.\",\n" +
            "      \"popularity\": 1242.358,\n" +
            "      \"poster_path\": \"/1HOYvwGFioUFL58UVvDRG6beEDm.jpg\",\n" +
            "      \"release_date\": \"2022-08-05\",\n" +
            "      \"title\": \"Luck\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 8,\n" +
            "      \"vote_count\": 646\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/14QbnygCuTO0vl7CAFmPf1fgZfV.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        878\n" +
            "      ],\n" +
            "      \"id\": 634649,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Spider-Man: No Way Home\",\n" +
            "      \"overview\": \"Peter Parker is unmasked and no longer able to separate his normal life from the high-stakes of being a super-hero. When he asks for help from Doctor Strange the stakes become even more dangerous, forcing him to discover what it truly means to be Spider-Man.\",\n" +
            "      \"popularity\": 1091.717,\n" +
            "      \"poster_path\": \"/uJYYizSuA9Y3DCs0qS4qWvHfZg4.jpg\",\n" +
            "      \"release_date\": \"2021-12-15\",\n" +
            "      \"title\": \"Spider-Man: No Way Home\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 8,\n" +
            "      \"vote_count\": 15016\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/iGHFjqxH5c8zRibnZbh9qEYTBho.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        28\n" +
            "      ],\n" +
            "      \"id\": 1008779,\n" +
            "      \"original_language\": \"es\",\n" +
            "      \"original_title\": \"La Princesa\",\n" +
            "      \"overview\": \"Refusing to marry a drug lord, Grecia is determined to pay her father's debt herself. To earn the money, she decides to bet in the Sinaloa palenques, where she meets Armando. He is immediately captivated by her beauty and fearless attitude. But, little does he know that falling for her will be his most dangerous endeavor. Based on the famous corrido hit \\\"La Princesa\\\", by Alfredo Ríos \\\"El Komander\\\".\",\n" +
            "      \"popularity\": 1072.493,\n" +
            "      \"poster_path\": \"/ksxiXqwPuEjh3gct1zUpyzNoQFt.jpg\",\n" +
            "      \"release_date\": \"2022-08-05\",\n" +
            "      \"title\": \"The princess\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.6,\n" +
            "      \"vote_count\": 53\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/1n7ZGr6WeDOW4rFiQKmFel8baWH.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        53,\n" +
            "        27\n" +
            "      ],\n" +
            "      \"id\": 760741,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Beast\",\n" +
            "      \"overview\": \"A recently widowed man and his two teenage daughters travel to a game reserve in South Africa. However, their journey of healing soon turns into a fight for survival when a bloodthirsty lion starts to stalk them.\",\n" +
            "      \"popularity\": 940.208,\n" +
            "      \"poster_path\": \"/xIGr7UHsKf0URWmyyd5qFMAq4d8.jpg\",\n" +
            "      \"release_date\": \"2022-08-11\",\n" +
            "      \"title\": \"Beast\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 6.8,\n" +
            "      \"vote_count\": 116\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/8wwXPG22aNMpPGuXnfm3galoxbI.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        10751,\n" +
            "        35\n" +
            "      ],\n" +
            "      \"id\": 675353,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Sonic the Hedgehog 2\",\n" +
            "      \"overview\": \"After settling in Green Hills, Sonic is eager to prove he has what it takes to be a true hero. His test comes when Dr. Robotnik returns, this time with a new partner, Knuckles, in search for an emerald that has the power to destroy civilizations. Sonic teams up with his own sidekick, Tails, and together they embark on a globe-trotting journey to find the emerald before it falls into the wrong hands.\",\n" +
            "      \"popularity\": 917.179,\n" +
            "      \"poster_path\": \"/6DrHO1jr3qVrViUO6s6kFiAGM7.jpg\",\n" +
            "      \"release_date\": \"2022-03-30\",\n" +
            "      \"title\": \"Sonic the Hedgehog 2\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.7,\n" +
            "      \"vote_count\": 2940\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/fQ5sZ6frXiAZuufgkVJnDwFFUQ4.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        53\n" +
            "      ],\n" +
            "      \"id\": 948333,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Into the Deep\",\n" +
            "      \"overview\": \"Follows a woman desperate to escape her town, she meets a stranger who promises a romantic escape, but it results in deceit, mistrust, and violence.\",\n" +
            "      \"popularity\": 687.036,\n" +
            "      \"poster_path\": \"/u4bDUBd6PJqP31u3KDiQBBtnaQs.jpg\",\n" +
            "      \"release_date\": \"2022-08-26\",\n" +
            "      \"title\": \"Into the Deep\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.2,\n" +
            "      \"vote_count\": 11\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/qViFGWCHaSmW4gP00RGh3xjMjsP.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        27,\n" +
            "        9648\n" +
            "      ],\n" +
            "      \"id\": 758724,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"The Cellar\",\n" +
            "      \"overview\": \"When Keira Woods' daughter mysteriously vanishes in the cellar of their new house in the country, she soon discovers there is an ancient and powerful entity controlling their home that she will have to face or risk losing her family's souls forever.\",\n" +
            "      \"popularity\": 618.316,\n" +
            "      \"poster_path\": \"/rtfGeS5WMXA6PtikIYUmYTSbVdg.jpg\",\n" +
            "      \"release_date\": \"2022-03-25\",\n" +
            "      \"title\": \"The Cellar\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 6.6,\n" +
            "      \"vote_count\": 220\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/5GA3vV1aWWHTSDO5eno8V5zDo8r.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        27,\n" +
            "        53,\n" +
            "        80,\n" +
            "        9648\n" +
            "      ],\n" +
            "      \"id\": 760161,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Orphan: First Kill\",\n" +
            "      \"overview\": \"After escaping from an Estonian psychiatric facility, Leena Klammer travels to America by impersonating Esther, the missing daughter of a wealthy family. But when her mask starts to slip, she is put against a mother who will protect her family from the murderous “child” at any cost.\",\n" +
            "      \"popularity\": 687.283,\n" +
            "      \"poster_path\": \"/wSqAXL1EHVJ3MOnJzMhUngc8gFs.jpg\",\n" +
            "      \"release_date\": \"2022-07-27\",\n" +
            "      \"title\": \"Orphan: First Kill\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.1,\n" +
            "      \"vote_count\": 479\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/k2G4WqGiT60K9yJnPh4K6VLnl3A.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        12,\n" +
            "        14\n" +
            "      ],\n" +
            "      \"id\": 639933,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"The Northman\",\n" +
            "      \"overview\": \"Prince Amleth is on the verge of becoming a man when his father is brutally murdered by his uncle, who kidnaps the boy's mother. Two decades later, Amleth is now a Viking who's on a mission to save his mother, kill his uncle and avenge his father.\",\n" +
            "      \"popularity\": 613.499,\n" +
            "      \"poster_path\": \"/zhLKlUaF1SEpO58ppHIAyENkwgw.jpg\",\n" +
            "      \"release_date\": \"2022-04-07\",\n" +
            "      \"title\": \"The Northman\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.2,\n" +
            "      \"vote_count\": 2318\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/pdD47rPAYKVdPasoyhSAFPIFIWo.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        35,\n" +
            "        53\n" +
            "      ],\n" +
            "      \"id\": 718930,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Bullet Train\",\n" +
            "      \"overview\": \"Unlucky assassin Ladybug is determined to do his job peacefully after one too many gigs gone off the rails. Fate, however, may have other plans, as Ladybug's latest mission puts him on a collision course with lethal adversaries from around the globe—all with connected, yet conflicting, objectives—on the world's fastest train.\",\n" +
            "      \"popularity\": 628.866,\n" +
            "      \"poster_path\": \"/tVxDe01Zy3kZqaZRNiXFGDICdZk.jpg\",\n" +
            "      \"release_date\": \"2022-07-03\",\n" +
            "      \"title\": \"Bullet Train\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.5,\n" +
            "      \"vote_count\": 692\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/ftGzl2GCyko61Qp161bQElN2Uzd.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        53\n" +
            "      ],\n" +
            "      \"id\": 961484,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Last Seen Alive\",\n" +
            "      \"overview\": \"After Will Spann's wife suddenly vanishes at a gas station, his desperate search to find her leads him down a dark path that forces him to run from authorities and take the law into his own hands.\",\n" +
            "      \"popularity\": 508.778,\n" +
            "      \"poster_path\": \"/qvqyDj34Uivokf4qIvK4bH0m0qF.jpg\",\n" +
            "      \"release_date\": \"2022-05-19\",\n" +
            "      \"title\": \"Last Seen Alive\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 6.7,\n" +
            "      \"vote_count\": 283\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/3myU9OTSvAXxFVYBDUDs9zDFF4P.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        27,\n" +
            "        53\n" +
            "      ],\n" +
            "      \"id\": 629015,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Shut In\",\n" +
            "      \"overview\": \"A young single mother is held captive along with her two children by a violent ex and must plot their escape before it’s too late.\",\n" +
            "      \"popularity\": 458.157,\n" +
            "      \"poster_path\": \"/b5ug4LyLQFeR6azAJyIPBQz5ur9.jpg\",\n" +
            "      \"release_date\": \"2022-03-24\",\n" +
            "      \"title\": \"Shut In\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.1,\n" +
            "      \"vote_count\": 202\n" +
            "    },\n" +
            "    {\n" +
            "      \"adult\": false,\n" +
            "      \"backdrop_path\": \"/vjnLXptqdxnpNJer5fWgj2OIGhL.jpg\",\n" +
            "      \"genre_ids\": [\n" +
            "        28,\n" +
            "        53,\n" +
            "        80\n" +
            "      ],\n" +
            "      \"id\": 818397,\n" +
            "      \"original_language\": \"en\",\n" +
            "      \"original_title\": \"Memory\",\n" +
            "      \"overview\": \"Alex, an assassin-for-hire, finds that he's become a target after he refuses to complete a job for a dangerous criminal organization. With the crime syndicate and FBI in hot pursuit, Alex has the skills to stay ahead, except for one thing: he is struggling with severe memory loss, affecting his every move. Alex must question his every action and whom he can ultimately trust.\",\n" +
            "      \"popularity\": 528.387,\n" +
            "      \"poster_path\": \"/4Q1n3TwieoULnuaztu9aFjqHDTI.jpg\",\n" +
            "      \"release_date\": \"2022-04-28\",\n" +
            "      \"title\": \"Memory\",\n" +
            "      \"video\": false,\n" +
            "      \"vote_average\": 7.2,\n" +
            "      \"vote_count\": 745\n" +
            "    }\n" +
            "  ],\n" +
            "  \"total_pages\": 81,\n" +
            "  \"total_results\": 1609\n" +
            "}"
}