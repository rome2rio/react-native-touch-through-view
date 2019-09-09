require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name         = "ReactNativeTouchThroughView"
  s.version      = package['version']
  s.summary      = package['description']
  s.license      = "MIT"

  s.authors      = package['author']
  s.homepage     = package['homepage']
  s.platforms    = { :ios => "9.0", :tvos => "9.0" }

  s.source       = { :git => "https://github.com/rome2rio/react-native-touch-through-view.git", :tag => "#{s.version}" }
  s.source_files  = "ios/**/*.{h,m}"
  s.requires_arc = true

  s.dependency 'React'
end
