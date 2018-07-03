
# react-native-advanced-webview

## Getting started

`$ npm install react-native-advanced-webview --save`

### Mostly automatic installation

`$ react-native link react-native-advanced-webview`

### Manual installation


#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.dealerslink.RNAdvancedWebviewPackage;` to the imports at the top of the file
  - Add `new RNAdvancedWebviewPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-advanced-webview'
  	project(':react-native-advanced-webview').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-advanced-webview/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-advanced-webview')
  	```


## Usage
```javascript
import RNAdvancedWebview from 'react-native-advanced-webview';

// TODO: What to do with the module?
RNAdvancedWebview;
```
  