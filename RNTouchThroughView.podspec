require 'json'
package = JSON.parse(File.read('package.json'))

Pod::Spec.new do |s|
  s.name             = "RNTouchThroughView"
  s.version          = package["version"]
  s.summary          = package["description"]
  s.requires_arc     = true
  s.license          = package["license"]
  s.homepage         = 'n/a'
  s.authors          = { package["author"] => package["repository"]["url"] }
  s.source           = { :git => package["repository"]["url"] }
  s.source_files     = ['ios/*.{h,m}']
  s.platform         = :ios, "8.0"
  s.dependency          'React'
end
