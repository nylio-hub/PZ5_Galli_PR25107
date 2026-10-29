package com.example.pz5_galli_pr25107

object SampleData {
    val conversationSample = listOf(
        Message("Lexi", "Test...Test...Test..."),
        Message("Lexi", """List of Android versions:
            |Android KitKat (API 19)
            |Android Lollipop (API 21)
            |Android Marshmallow (API 23)
            |Android Nougat (API 24)
            |Android Oreo (API 26)
            |Android Pie (API 28)
            |Android 10 (API 29)
            |Android 11 (API 30)
            |Android 12 (API 31)""".trimMargin()),
        Message("Lexi", """I think Kotlin is my favorite programming language.
            |It's so much fun!""".trimMargin()),
        Message("Lexi", "Searching for alternatives to XML layouts..."),
        Message("Lexi", """Hey, take a look at Jetpack Compose, it's great!
            |It's the Android's modern toolkit for building native UI.
            |It simplifies and accelerates UI development on Android.
            |Less code, powerful tools, and intuitive Kotlin APIs :)""".trimMargin()),
        Message("Lexi", "It's available from API 21+ :)"),
        Message("Lexi", "Writing Kotlin for UI seems so natural, Compose where have you been all my life?")
    )
}