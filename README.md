
# react-native-geolocation-service

## Getting started

`$ npm install react-native-geolocation-service --save`

### Mostly automatic installation

`$ react-native link react-native-geolocation-service`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-geolocation-service` and add `RNGeolocationService.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `libRNGeolocationService.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.amrtns.geolocationservice.RNGeolocationServicePackage;` to the imports at the top of the file
  - Add `new RNGeolocationServicePackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-geolocation-service'
  	project(':react-native-geolocation-service').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-geolocation-service/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-geolocation-service')
  	```


## Usage
```javascript
import RNGeolocationService from 'react-native-geolocation-service';

// TODO: What do with the module?
RNGeolocationService;
```
  