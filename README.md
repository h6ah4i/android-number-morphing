android-morphing-number
========================
[![](https://jitpack.io/v/ronaldsmartin/android-number-morphing.svg)](https://jitpack.io/#ronaldsmartin/android-number-morphing) [![Dependency Status](https://www.versioneye.com/user/projects/57ae3d86d6720e00357dbc42/badge.svg?style=flat-square)](https://www.versioneye.com/user/projects/57ae3d86d6720e00357dbc42)

This is a fork of [dgmltn's fork](https://github.com/dgmltn/android-number-morphing) of [bydavy's android-number-morphing library](https://github.com/bydavy/android-number-morphing).

It updates the project's Gradle build settings so that the library can be built successfully with Android Studio 2+ for distribution via [JitPack.io](https://jitpack.io/).

## About

This is an example of morphing effect implemented with Android UI toolkit. It is based on path and bezier curves. Some shortcuts have been taken. For instance, in the current implementation the Font is hardcoded but we can imagine loading it from svg files. 

## Video
<a href="http://www.youtube.com/watch?feature=player_embedded&v=3H0XO6r4hRw
" target="_blank"><img src="http://img.youtube.com/vi/3H0XO6r4hRw/0.jpg" 
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" /></a>

## Download

Grab this project with JitPack:

### Root build.gradle

	allprojects {
		repositories {
			...
			maven { url "https://jitpack.io" }
		}
	}
	
### App build.gradle:

    dependencies {
      compile 'com.github.h6ah4i:android-number-morphing:vX.X.X'
    }
