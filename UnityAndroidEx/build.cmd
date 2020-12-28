echo on

gradlew.bat assembleRelease && call wsl find . -name "app-release.aar" -exec cp -v {} unityex.aar \; && copy /V /Y unityex.aar ..\UnityExExample\Assets\Plugins\Android\libs
