//
//  Created by Marton Bodonyi (@martsie) on 3/3/17.
//

#import "R2RTouchThroughViewManager.h"
#import "R2RTouchThroughView.h"

@implementation R2RTouchThroughViewManager
RCT_EXPORT_MODULE()

- (UIView *)view
{
    return [R2RTouchThroughView new];
}

@end
