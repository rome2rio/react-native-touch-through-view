//
//  Created by Marton Bodonyi (@martsie) on 3/3/17.
//

#import "R2RTouchThroughWrapper.h"
#import "R2RTouchThroughView.h"

@implementation R2RTouchThroughWrapper

- (UIView *)hitTest:(CGPoint)point withEvent:(UIEvent *)event
{
    UIView *view = [super hitTest:point withEvent:event];
    
    return [view isKindOfClass: [R2RTouchThroughView class]] ? nil : view;
}

@end
