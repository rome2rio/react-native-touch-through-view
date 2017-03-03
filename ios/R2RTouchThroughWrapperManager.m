//
//  Created by Marton Bodonyi (@martsie) on 3/3/17.
//

#import "R2RTouchThroughWrapperManager.h"
#import "R2RTouchThroughWrapper.h"

@implementation R2RTouchThroughWrapperManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
    return [R2RTouchThroughWrapper new];
}

@end
