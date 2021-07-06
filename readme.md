# Core splash screen api

- Can be supported down to API 23.
- Can be used if we compile our project with API 31 / Android S / Android 12.
- Interestingly Google was against splash screen in the old time, 
but after that they are began to use splash screen to their android products.
Now they are developing core splash screen API :).
- [Splash screen might be a bad pattern.](https://androiduipatterns.com/splash-screen-with-any-other-name-is-still-a-splash-screen-and-they-suck-bab7f3b5850c) 

## Can be implemented to our project by following 5 simple steps:
1. Change the compileSdkVersion to api 31 (android S).
```groovy
android {
    compileSdkVersion "android-S" // when Android 12 is in preview
    // compileSdkVersion 31 - when the Android 12 is stable
}
```
2. Import dependency.
```groovy
dependencies {
    implementation "androidx.core:core-splashscreen:1.0.0-alpha01"
}
```
3. Create splash screen theme, update night theme if the app supports it.
```XML
<style name="Theme.YourSplashThem" parent="Theme.SplashScreen">
    <item name="windowSplashScreenBackground">@color/purple_500</item>
    <item name="windowSplashScreenAnimatedIcon">@mipmap/ic_launcher</item>
    <item name="postSplashScreenTheme">@style/Theme.YourAppTheme</item>
</style>
```
4. Change app theme to splash theme.
```XML
<application
    android:theme="@style/Theme.YourSplashTheme" />
```
5. Call installSplashScreen() before setContentView of your main activity.
```kotlin
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    installSplashScreen()
    setContentView(R.layout.activity_main)
}
```

## Result
<img width="400" src="CoreSplashScreenApi.gif"/>
