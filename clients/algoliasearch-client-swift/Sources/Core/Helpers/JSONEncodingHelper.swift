//
// JSONEncodingHelper.swift
//
// Created by Algolia on 08/01/2024
//

import Foundation

open class JSONEncodingHelper {

  open class func encodingParameters<T: Encodable>(forEncodableObject encodableObj: T?) -> [String:
    Any]?
  {
    var params: [String: Any]?

    // Encode the Encodable object
    if let encodableObj = encodableObj {
      let encodeResult = CodableHelper.encode(encodableObj)
      do {
        let data = try encodeResult.get()
        params = JSONDataEncoding.encodingParameters(jsonData: data)
      } catch {
        print(error.localizedDescription)
      }
    }

    return params
  }

  open class func encodingParameters(forEncodableObject encodableObj: Any?) -> [String: Any]? {
    var params: [String: Any]?

    if let encodableObj = encodableObj {
      do {
        let data = try JSONSerialization.data(withJSONObject: encodableObj, options: .prettyPrinted)
        params = JSONDataEncoding.encodingParameters(jsonData: data)
      } catch {
        print(error.localizedDescription)
        return nil
      }
    }

    return params
  }

}