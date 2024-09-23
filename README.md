## Libconflict
Sample Android aar lib to demonstrate `-repackageclasses` option

### How to build
1. Run `./gradlew :libconflict:publishReleasePublicationToAarOutRepository`
2. Check `buildDir/aarOut/***/libconflic-1.0.0.aar` if it exists
3. Use your favorite .aar/.jar inspector
4. Notice that all the obfuscated classes start with package in alphabetical order
5. Uncomment line 4 on `libconflict/proguard-rules.pro`
6. Recheck output in .aar/.jar inspector
