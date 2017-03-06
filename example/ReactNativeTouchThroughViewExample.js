/**
 * Example implementation of react-native-touch-through-view component.
 * https://github.com/rome2rio/react-native-touch-through-view
 * @flow
 */

import React, { Component } from 'react';
import {
  StyleSheet,
  Text,
  Image,
  Dimensions,
  ScrollView,
  ListView,
  Button,
  View
} from 'react-native';
import { TouchThroughView, TouchThroughWrapper } from 'react-native-touch-through-view';

const ReactNativeTouchThroughViewExample = () => (
  <View style={styles.container}>
    <View style={styles.artistInfo}>
      <View style={styles.albumImageWrapper}>
        <Image source={require("./album.jpg")} style={styles.albumImage} />
      </View>
      <Button style={styles.button} title="Play" onPress={() => { }} />
    </View>
    <TouchThroughWrapper style={styles.scrollWrapper}>
      <ListView
        style={styles.scroller}
        dataSource={dataSource}
        renderHeader={() => <TouchThroughView style={styles.touchThroughView} />}
        renderRow={(rowData) => {
          return (
            <Text style={styles.itemRow}>{rowData}</Text>
          )
        }}>
      </ListView>
    </TouchThroughWrapper>
  </View>
);

export default ReactNativeTouchThroughViewExample

const ds = new ListView.DataSource({ rowHasChanged: (r1, r2) => r1 !== r2 });
const rows = [];

let i = 0;
while (i < 1000) {
  rows.push(`Item ${i}`);
  i++;
}

const dataSource = ds.cloneWithRows(rows);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#eee',
    paddingTop: 20,
  },
  button: {
    marginTop: 20,
  },
  albumImage: {
    width: 300,
    height: 300,
  },
  albumImageWrapper: {
    marginTop: 20,
    marginBottom: 10,
    padding: 10,
    width: 320,
    height: 320,
    alignSelf: 'center',
    backgroundColor: 'white',
    shadowColor: '#ccc',
    shadowOpacity: 1,
    shadowRadius: 5,
    shadowOffset: { width: 0, height: 0 },
  },
  artistInfo: {
    position: 'absolute',
    top: 20,
    left: 0,
    right: 0,
    height: 400,
    zIndex: 0,
  },
  scroller: {
    zIndex: 1,
  },
  scrollWrapper: {
    flex: 1,
  },
  touchThroughView: {
    height: 400,
    flex: 1,
  },
  itemRow: {
    backgroundColor: '#ddd',
    padding: 20,
    borderBottomWidth: 5,
    borderBottomColor: '#000',
  }
});