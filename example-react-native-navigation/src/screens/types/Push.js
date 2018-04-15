import React, { Component } from "react";
import {
  StyleSheet,
  View,
  Text,
  Button,
  Alert,
  ListView,
  ScrollView,
  TouchableOpacity,
  FlatList
} from "react-native";

import {
  TouchThroughView,
  TouchThroughWrapper
} from "react-native-touch-through-view";

export default class Push extends Component {
  constructor(props, context) {
    super(props, context);

    this.scrollViewContent = [];
    this.flatListContent = [];

    for (let i = 0; i < 200; i++) {
      this.scrollViewContent.push(i);
      this.flatListContent.push({ key: i });
    }
  }

  render() {
    return (
      <View style={styles.container}>
        <View
          style={{
            position: "absolute",
            left: 0,
            top: 0,
            bottom: 0,
            right: 0,
            backgroundColor: "red"
          }}
        >
          <ScrollView>
            {this.scrollViewContent.map(index => (
              <View key={index}>
                <TouchableOpacity
                  onPress={() => {
                    alert(`I'm item ${index}`);
                  }}
                >
                  <Text>Item #{index}</Text>
                </TouchableOpacity>
              </View>
            ))}
          </ScrollView>
        </View>
        <TouchThroughWrapper style={{ flex: 1 }}>
          <FlatList
            data={this.flatListContent}
            style={{ flex: 1 }}
            ListHeaderComponent={() => (
              <TouchThroughView style={{ height: 400 }} />
            )}
            renderItem={({ item }) => (
              <View style={{ backgroundColor: "white" }}>
                <Text>{item.key}</Text>
              </View>
            )}
          />
        </TouchThroughWrapper>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1
  }
});
