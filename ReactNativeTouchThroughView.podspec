require 'json'

package = JSON.parse(File.read(File.join(__dir__, 'package.json')))

Pod::Spec.new do |s|
  s.name             = 'ReactNativeTouchThroughView'
  s.version          = package['version']
  s.summary          = package['description']
  s.license          = package['license']
  s.homepage         = 'https://github.com/rome2rio/react-native-touch-through-view'
  s.authors          = 'rome2rio'
  s.source           = { :git => 'https://github.com/rome2rio/react-native-touch-through-view.git', :tag => "v#{s.version}" }
  s.source_files     = 'ios/**/*.{h,m}'
  s.requires_arc     = true
  s.platform         = :ios, "7.0"
  s.dependency         'React'  
end
