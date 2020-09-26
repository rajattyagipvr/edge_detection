import 'dart:async';

import 'package:flutter/services.dart';

class EdgeDetection {
  static const MethodChannel _channel = const MethodChannel('edge_detection');

  static Future<String> get detectEdge async {
    final String version = await _channel.invokeMethod('edge_detect');
    return version;
  }

  static useInternalStorage(bool use_internal_storage) {
    _channel.invokeMethod('use_internal_storage', use_internal_storage);
  }
}
