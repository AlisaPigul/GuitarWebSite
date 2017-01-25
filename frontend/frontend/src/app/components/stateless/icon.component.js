import React from "react";
import {getImagePath} from "../../utils/path";
/**
 * Icon component with opportunity to add tooltip
 * Input:
 * 1) img - background image
 * 2) tooltip - text
 * Output:
 * 1) onclick - fires when user click the icon
 * @author rlapin
 */



export const Icon = ({onClick, tooltip, img}) => {
    debugger

    const divStyle = img && {
            backgroundImage: `url(${getImagePath(img)})`,
            backgroundRepeat: 'no-repeat,no-repeat',
            backgroundPosition: 'center'
}
    ;
    return (
        <i onClick={(event) => onClick(event)} style={divStyle} className="icon">
            <span className="tooltip">{tooltip}</span>
        </i>
    )
};