/**
 * Copyright (c) 2015-present, Facebook, Inc.
 * All rights reserved.
 *
 * This source code is licensed under the BSD-style license found in the
 * LICENSE file in the root directory of this source tree. An additional grant
 * of patent rights can be found in the PATENTS file in the same directory.
 *
 * @providesModule TouchThroughScrollView
 * @flow
 */
import React, {Component, PropTypes} from 'react';
import {View, requireNativeComponent} from 'react-native';

export default class TouchThroughWrapper extends Component {
  render() {
    return <R2RTouchThroughWrapper {...this.props} />;
  }
};

TouchThroughWrapper.propTypes = {
  ...View.propTypes,
};

const R2RTouchThroughWrapper = requireNativeComponent('R2RTouchThroughWrapper', TouchThroughWrapper);
